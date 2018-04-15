package cn.foreverking.custommer.server.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.foreverking.custommer.server.po.UserPO;

@FeignClient(name = "move-service", fallback = HelloServiceFallback.class)
public interface HelloService {

	@RequestMapping("/hello")
	String hello();

	@RequestMapping("/hello1")
	String hello(@RequestParam("name") String name);

	@RequestMapping("/hello2")
	UserPO hello(@RequestParam("name") String name, @RequestParam("age") int age);

	@RequestMapping("/hello3")
	String hello(@RequestBody UserPO user);

}
