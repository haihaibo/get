package com.example.demo.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value="classpath:/properties/dog.properties")
@ConfigurationProperties(prefix="dog")
public class Dog implements Serializable{
	private static final long serialVersionUID = -745621106086682749L;
	//@Value("${dog.id}")
	private Integer id;
	//@Value("${dog.name}")
	private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + "]";
	}
	
}
