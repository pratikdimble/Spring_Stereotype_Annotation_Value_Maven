package com.app.beans;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empObj")
public class Employee {
	
	@Value("10")
	private int id;
	@Value("Pratik")
	private String name;
	@Value("{setobj}")
	private Set<String> set;
	@Autowired
	private Address addr;
	@Override
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", set=" + set + ", addr=" + addr + "]";
	}

	
}
