package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ZookeeperClientTest {
	@Autowired private ZookeeperClient zookeeperClient;

	@Test
	public void testRun() {
		log.info(Utility.HR);
		zookeeperClient.run();
		log.info(Utility.HR);
	}

}
