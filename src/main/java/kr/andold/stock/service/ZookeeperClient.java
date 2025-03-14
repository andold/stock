package kr.andold.stock.service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.apache.zookeeper.AddWatchMode;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import org.apache.zookeeper.ZooKeeper;

@Slf4j
@Service
public class ZookeeperClient implements Watcher {
	private static final String ZNODE_PREFIX = "c_";

	@Getter private static boolean isMaster = false;
	@Getter private static String currentZNodeName = "";

	private ZooKeeper zookeeper;

	@Getter private static String zookeeperConnectString;
	@Value("${application.zookeeper.connect.string}")
	public void setZookeeperConnectString(String value) {
		log.info("{} setZookeeperConnectString(『{}』)", Utility.indentMiddle(), value);
		zookeeperConnectString = value;
	}

	@Getter private static String zookeeperZnodeElectPath;
	@Value("${application.zookeeper.znode.elect.path}")
	public void setZookeeperZnodeElectPath(String value) {
		log.info("{} setZookeeperZnodeElectPath(『{}』)", Utility.indentMiddle(), value);
		zookeeperZnodeElectPath = value;
	}

	public void run() {
		log.info("{} run() - 『{}』『{}』", Utility.indentStart(), zookeeperConnectString, zookeeperZnodeElectPath);

		try {
			zookeeper = new ZooKeeper(getZookeeperConnectString(), 3000, this);
		} catch (IOException e) {
			log.error("IOException:: {}", e.getMessage(), e);
		}

		log.info("{} run() - 『{}』『{}』", Utility.indentEnd(), zookeeperConnectString, zookeeperZnodeElectPath);
	}

	@Override
	public void process(WatchedEvent event) {
		log.info("{} process(『{}』) - 『{}:{}』『{}』", Utility.indentStart(), event, event.getType(), event.getState(), currentZNodeName);

		switch(event.getType()) {
		case None:
			switch(event.getState()) {
			case AuthFailed:
				break;
			case Closed:
				try {
					zookeeper = new ZooKeeper(getZookeeperConnectString(), 3000, this);
				} catch (IOException e) {
					log.error("IOException:: {}", e.getMessage(), e);
				}
				break;
			case ConnectedReadOnly:
				break;
			case Disconnected:
				updateMaster();
				break;
			case Expired:
				try {
					zookeeper.removeWatches(getZookeeperZnodeElectPath(), this, WatcherType.Persistent, true);
					zookeeper.close();
					currentZNodeName = "";
				} catch (InterruptedException e) {
					log.error("InterruptedException:: {}", e.getMessage(), e);
				} catch (KeeperException e) {
					log.error("KeeperException:: {}", e.getMessage(), e);
				}
				break;
			case SaslAuthenticated:
				break;
			case SyncConnected:
				try {
					zookeeper.addWatch(getZookeeperZnodeElectPath(), this, AddWatchMode.PERSISTENT);
					String zNodeFullPath = zookeeper.create(getZookeeperZnodeElectPath() + "/" + ZNODE_PREFIX, new byte[] {}, Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
					currentZNodeName = zNodeFullPath.replace(getZookeeperZnodeElectPath() + "/", "");
				} catch (KeeperException e) {
					log.error("KeeperException:: {}", e.getMessage(), e);
				} catch (InterruptedException e) {
					log.error("InterruptedException:: {}", e.getMessage(), e);
				}
				break;
			default:
				break;
			}
			break;
		case NodeDeleted:
		case NodeCreated:
		case NodeDataChanged:
		case NodeChildrenChanged:
			updateMaster();
			break;
		default:
			updateMaster();
			break;
		}
		
		log.info("{} process(『{}』) - 『{}:{}』『{}』", Utility.indentEnd(), event, event.getType(), event.getState(), currentZNodeName);
	}

	private boolean updateMaster() {
		if (zookeeper == null) {
			return false;
		}

		try {
			List<String> children = zookeeper.getChildren(getZookeeperZnodeElectPath(), false);
			Collections.sort(children);
			String smallestChild = children.get(0);
			isMaster = smallestChild.equals(currentZNodeName);
			log.info("{} updateMaster() - {} {} {}", Utility.indentMiddle(), children, currentZNodeName, isMaster);
			return true;
		} catch(Exception e) {
			log.error("Exception:: {}", e.getMessage(), e);
		}

		return false;
	}

}
