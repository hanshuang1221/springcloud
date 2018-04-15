package cn.foreverking.custommer.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.foreverking.custommer.server.po.UserPO;
import cn.foreverking.custommer.server.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/feign-customer")
	public String hello() {
		return helloService.hello();
	}

	@RequestMapping(value = "/feign-customer1")
	public String hello1() {
		return helloService.hello();
	}

	@RequestMapping(value = "/feign-customer2")
	public String hello2() {
		StringBuilder builder = new StringBuilder();
		builder.append(helloService.hello()).append("\n");
		builder.append(helloService.hello("DIDI")).append("\n");
		builder.append(helloService.hello("DIDI", 31)).append("\n");
		builder.append(helloService.hello(new UserPO("DIDI", 31))).append("\n");
		return builder.toString();
	}
}
