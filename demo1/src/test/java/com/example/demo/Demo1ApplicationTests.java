package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.pojo.Dog;
import com.example.demo.pojo.Shiro;
import com.example.demo.pojo.User;

@RunWith(SpringRunner.class)	//获取test测试类
@SpringBootTest	//	动态加载spring容器
public class Demo1ApplicationTests {
	@Autowired	//自动装配，di(这里是注解注入)注入对象属性
	private User user;
	@Autowired
	private Dog dog;
	@Autowired
	private Shiro shiro;
	@Test//测试注解，这是一个测试函数
	public void UserTest() {
		System.out.println(user);
	}
	@Test
	public void DogTest() {
		System.out.println(dog);
	}
	@Test
	public void ShiroTest() {
		shiro.pro();
	}
}
