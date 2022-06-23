package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory 
		= new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("CollectionBean");
//		List<String> addressList = bean.getAddressList();
//		Set<String> addressList = bean.getAddressList();
//		for (String address : addressList) {
//			System.out.println(address.toString());
//		}
		
//		Map<String, String> addressMap = bean.getAddressMap();
//		
//		for(String key : addressMap.keySet()) {
//			System.out.println(key + " : " + addressMap.get(key));
//		}
		
//		for(int i=0;i<1;i++)
//		System.out.println(addressMap.toString());
		
		Properties proper = bean.getAddressProperties();
		for(String key : proper.stringPropertyNames()) {
			System.out.println(key + " : " + proper.get(key));
		}
		factory.close();
	}

}












