package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {



	//	private List<String> addressList;
//	private Set<String> addressList;
//	private Map<String, String> addressMap;
	private Properties addressProperties;
	
	public Properties getAddressProperties() {
		return addressProperties;
	}
	
	public void setAddressProperties(Properties addressProperties) {
		this.addressProperties = addressProperties;
	}
//	public void setAddressMap(Map<String, String> addressMap) {
//		this.addressMap = addressMap;
//	}	
//	public Map<String, String> getAddressMap() {
//		return addressMap;
//	}
//	public void setAddressList(Set<String> addressList) {
//		this.addressList = addressList;
//	}
//	public void setAddressList(List<String> addressList) {
//		this.addressList = addressList;
//	}
//	public Set<String> getAddressList() {
//		return addressList;
//	}
}
