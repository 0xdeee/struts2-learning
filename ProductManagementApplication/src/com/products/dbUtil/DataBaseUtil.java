package com.products.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author dstar - DataBaseUtil is for creating and closing Database connectiton
 *         using JDBC. Database Server used - oracle Database 11g express
 *         edition JDBC Driver used - Thin Driver
 *
 */
public class DataBaseUtil {

	public static Connection getConnection() {

		Connection connection = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "qwerty");
			System.out.println("Connection is created Successfully");

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Error Encountered while creating connection");
			e.printStackTrace();

		}

		return connection;
	}

	public static void closeConnection(Connection connection) {

		try {

			connection.close();
			System.out.println("Connection to the DataBase is Closed");

		} catch (SQLException e) {

			System.out.println("Error Encountered While closing connecion");
			e.printStackTrace();

		}
	}
}
