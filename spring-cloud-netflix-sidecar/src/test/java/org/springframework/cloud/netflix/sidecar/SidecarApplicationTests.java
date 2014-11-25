package org.springframework.cloud.netflix.sidecar;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SidecarApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port=0")
@Ignore
public class SidecarApplicationTests {
	
	@Test()
	public void contextLoads() {
	}

}
