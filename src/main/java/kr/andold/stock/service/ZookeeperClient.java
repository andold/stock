package kr.andold.stock.service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
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
	@Getter private static boolean isMaster = false;

	private ZooKeeper zookeeper;
	private String currentZNodeName;

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
			zookeeper = new ZooKeeper(zookeeperConnectString, 3000, this);
//			zookeeper.create("/test/elect-stock", new byte[] {}, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
//			zookeeper.create("/elect-stock", new byte[] {}, Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
			String zNodeFullPath = zookeeper.create(zookeeperZnodeElectPath + "/c_", new byte[] {}, Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
			currentZNodeName = zNodeFullPath.replace(zookeeperZnodeElectPath + "/", "");
			log.info("{} run() - 『zNodeFullPath:{}』『currentZNodeName:{}』", Utility.indentMiddle(), zNodeFullPath, currentZNodeName);
		} catch (IOException e) {
			log.error("{} IOException:: {}", Utility.indentMiddle(), e.getMessage(), e);
		} catch (KeeperException e) {
			log.error("{} KeeperException:: {}", Utility.indentMiddle(), e.getMessage(), e);
		} catch (InterruptedException e) {
			log.error("{} InterruptedException:: {}", Utility.indentMiddle(), e.getMessage(), e);
		}

		log.info("{} run() - 『{}』『{}』", Utility.indentEnd(), zookeeperConnectString, zookeeperZnodeElectPath);
	}

	@Override
	public void process(WatchedEvent event) {
		log.info("{} process(『{}』)", Utility.indentStart(), event);

		switch(event.getType()) {
		case None:
			if (event.getState() == Event.KeeperState.SyncConnected) {
				log.info("{} process(『{}』) - Successfully connected to zookeeper!!", Utility.indentMiddle(), event);
			} else {
				synchronized (zookeeper) {
					log.info("{} process(『{}』) - Disconnected from zookeeper event", Utility.indentMiddle(), event);
					zookeeper.notifyAll();
				}
			}
		case NodeDeleted:
		case NodeCreated:
		case NodeDataChanged:
		case NodeChildrenChanged:
			try {
				List<String> children = zookeeper.getChildren(zookeeperZnodeElectPath, false);
				ZookeeperClient.isMaster = isMaster(children);
			} catch(KeeperException e) {
			} catch(InterruptedException e) {
			}
			break;
		default:
			break;
		}
		
		log.info("{} process(『{}』)", Utility.indentEnd(), event);
	}

	private boolean isMaster(List<String> children) {
		log.info("{} isMaster({}) - {}", Utility.indentMiddle(), children, currentZNodeName);
		if (children == null || children.isEmpty() || currentZNodeName == null) {
			return false;
		}

		Collections.sort(children);
		String smallestChild = children.get(0);
		return smallestChild.equals(currentZNodeName);
	}

}
