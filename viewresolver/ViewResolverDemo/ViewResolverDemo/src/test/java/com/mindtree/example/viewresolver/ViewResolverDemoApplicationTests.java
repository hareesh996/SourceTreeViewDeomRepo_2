package com.mindtree.example.viewresolver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mindtree.example.ViewResolverDemoApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ViewResolverDemoApplication.class)
@WebAppConfiguration
public class ViewResolverDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
