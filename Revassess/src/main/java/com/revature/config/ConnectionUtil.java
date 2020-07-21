package com.revature.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Revature
 *
 *         This is a paceholder class to hold the configurations of your db
 *         connection. You should change the url, username, and password. DO NOT
 *         CHANGE THE MODIFIERS OR THE NAMES OF THE VARIABLES. These are used to
 *         test your db schema.
 */
public class ConnectionUtil {
	//for singleton instance
	private static ConnectionUtil cu;
	
	// add your jdbc url
	public static final String URL = "jdbc:postgresql://postgres.cls1tahxfwjt.us-east-2.rds.amazonaws.com:5432/postgres";
	// add your jdbc username
	public static final String USERNAME = "tester";
	// add your jdbc password
	public static final String PASSWORD = "dontbothertrying";
	// name of the created stored procedure in tier 3
	public static final String TIER_3_PROCEDURE_NAME = "my_function";
	// name of the created sequence in tier 3
	public static final String TIER_3_SEQUENCE_NAME = "my_sequence";

	// implement this method to connect to the db and return the connection object
	public Connection connect() throws SQLException {
		return null;
	} // DriverManager.getConnection(URL, USERNAME, PASSWORD);

	//implement this method with a callable statement that calls the absolute value sql function
	public long callAbsoluteValueFunction(long value){
		return value;
	}
	

	//make the class into a singleton
	private ConnectionUtil(){
		super();
	}

	public static ConnectionUtil getInstance(){
		if(cu == null){
			cu = new ConnectionUtil();
		}
		return cu;
	}
}
