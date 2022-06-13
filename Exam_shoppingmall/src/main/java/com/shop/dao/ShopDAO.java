package com.shop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ShopDAO {
	private Connection conn=null;
	private PreparedStatement ps = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/db0416?serverTimezone=UTC";
	private final String USERNAME = "root";
	private final String PASSWORD = "woojoo69";
}
