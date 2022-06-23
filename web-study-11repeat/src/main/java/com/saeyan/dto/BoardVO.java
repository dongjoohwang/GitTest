package com.saeyan.dto;

import java.sql.Timestamp;
import java.util.Date;

public class BoardVO {
	private Integer num;
	private String pass;
	private String name;
	private String email;
	private String title;
	private String content;
	private Integer readcount;
	private Timestamp writedate;	// 날짜 저장 필드
	/**
	 * @return the num
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the readcount
	 */
	public Integer getReadcount() {
		return readcount;
	}
	/**
	 * @param readcount the readcount to set
	 */
	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}
	/**
	 * @return the writedate
	 */
	public Timestamp getWritedate() {
		return writedate;
	}
	/**
	 * @param writedate the writedate to set
	 */
	public void setWritedate(Timestamp writedate) {
		this.writedate = writedate;
	}
}
