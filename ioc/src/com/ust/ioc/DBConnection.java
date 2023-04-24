package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements Connection{

	private String url;
	private String dbUserName;
	private String dbPassword;
	
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getDbUserName() {
		return dbUserName;
	}


	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}


	public String getDbPassword() {
		return dbPassword;
	}


	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}


	public  DBConnection getConnection() {
		
		try {
			java.sql.Connection con = DriverManager.getConnection(url,dbUserName,dbPassword);
			System.out.println("connected to mysql...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("getConnection called....");
		return new DBConnection();
	}
}

//object oriented programming takes pull based approach
//A class needs to look up or create instances on which it depends
//spring ioc is based on push approach.In other words object required by a class are injected with the help of configuration file.