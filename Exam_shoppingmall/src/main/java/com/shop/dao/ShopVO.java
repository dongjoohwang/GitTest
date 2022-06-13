package com.shop.dao;

import java.util.*;

public class ShopVO {
	private int custno, saleno, pcost, amount, price;
	private String custname, phone, address, grade, city, pcode;
	private Date joindate; 
	/**
	 * @return the custno
	 */
	public int getCustno() {
		return custno;
	}
	/**
	 * @param custno the custno to set
	 */
	public void setCustno(int custno) {
		this.custno = custno;
	}
	/**
	 * @return the saleno
	 */
	public int getSaleno() {
		return saleno;
	}
	/**
	 * @param saleno the saleno to set
	 */
	public void setSaleno(int saleno) {
		this.saleno = saleno;
	}
	/**
	 * @return the pcost
	 */
	public int getPcost() {
		return pcost;
	}
	/**
	 * @param pcost the pcost to set
	 */
	public void setPcost(int pcost) {
		this.pcost = pcost;
	}
	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the custname
	 */
	public String getCustname() {
		return custname;
	}
	/**
	 * @param custname the custname to set
	 */
	public void setCustname(String custname) {
		this.custname = custname;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the pcode
	 */
	public String getPcode() {
		return pcode;
	}
	/**
	 * @param pcode the pcode to set
	 */
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	/**
	 * @return the joindate
	 */
	public Date getJoindate() {
		return joindate;
	}
	/**
	 * @param joindate the joindate to set
	 */
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	/**
	 * @return the sdate
	 */
	public Date getSdate() {
		return sdate;
	}
	/**
	 * @param sdate the sdate to set
	 */
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	private Date sdate;
}
