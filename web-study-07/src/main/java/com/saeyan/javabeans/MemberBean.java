package com.saeyan.javabeans;

public class MemberBean {
	private String name;
	private String userid;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public MemberBean(String name, String userid) {
		super();
		this.name = name;
		this.userid = userid;
	}
	public MemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", userid=" + userid + "]";
	}
	/**
	 * @param userid the userid to set
	 */
}
