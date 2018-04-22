package cn.foreverking.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.foreverking.rabbitmq.controller.Sender;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitMQApplication.class)
public class RabbitMQApplicationTest {

	@Autowired
	private Sender sender;

	@Test
	public void hello() {
		sender.send();
	}
}
