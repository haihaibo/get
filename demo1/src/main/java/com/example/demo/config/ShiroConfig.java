package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.pojo.Shiro;

@Configuration
public class ShiroConfig {
	//交给spring管理
	@Bean
	public Shiro shiro() {
		return new Shiro();
	}
}
