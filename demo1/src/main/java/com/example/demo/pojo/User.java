package com.example.demo.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*为对象的属性赋值，需将当前对象交给spring容器管理*/
@Component	//component:组件      spring注解，交给spring管理
@ConfigurationProperties(prefix="user")
public class User implements Serializable{
	private static final long serialVersionUID = -5923086236209194891L;
	private Integer id;
	private String username;
	private Integer age;
	/*
	 * @Value("${user.id}")//注入属性值 private Integer id;
	 * @Value("${user.username}") private String uaername;
	 * @Value("${user.age}") private Integer age;
	 */
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
	}
}
