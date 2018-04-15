package cn.foreverking.custommer.server.service;

import org.springframework.stereotype.Component;

import cn.foreverking.custommer.server.po.UserPO;

@Component
public class HelloServiceFallback implements HelloService {

	@Override
	public String hello() {
		return "error";
	}

	@Override
	public String hello(String name) {
		return "error";
	}

	@Override
	public UserPO hello(String name, int age) {
		return new UserPO("未知", 0);
	}

	@Override
	public String hello(UserPO user) {
		return "error";
	}

}
