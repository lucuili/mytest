package cn.itcast.test;

import org.junit.Test;

import cn.itcast.factory.BeanFactory;
import cn.itcast.service.UserService;

public class TestDemo {
	
	@Test
	public void test1(){
		UserService userService = (UserService) BeanFactory.getBean("userService");
		userService.save();
	}
}
