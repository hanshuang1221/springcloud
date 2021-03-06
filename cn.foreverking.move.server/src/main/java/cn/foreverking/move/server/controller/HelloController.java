package cn.foreverking.move.server.controller;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.foreverking.move.server.po.UserPO;

@RestController
public class HelloController {
	private final Logger log = Logger.getLogger(HelloController.class);

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String index() throws InterruptedException {
		log.info("Hello world! server1");
		return "Hello world! server1";
	}

	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String index(@RequestParam String name) {
		log.info("server2： " + name);
		return "Hello " + name;
	}

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public UserPO index(@RequestParam String name, @RequestParam int age) {
		log.info("server2： " + age);
		return new UserPO(name, age);
	}

	@RequestMapping(value = "/hello3", method = RequestMethod.POST)
	public String index(@RequestBody UserPO user) {
		log.info("server2： " + user);
		return "Hello " + user.getName() + "; age:" + user.getAge();
	}
}
