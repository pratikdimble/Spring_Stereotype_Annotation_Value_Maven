package com.app.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addrObj")
public class Address {
	@Value("100")
	private int addrId;
	@Value("Pune")
	private String loc;
	@Value("{listObj}")
	private List<String> list;
	@Override
	
	
	public String toString() {
		return "Address [addrId=" + addrId + ", loc=" + loc + ", list=" + list + "]";
	}
	
	
	

}
