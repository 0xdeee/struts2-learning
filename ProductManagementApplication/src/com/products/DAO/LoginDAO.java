package com.products.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.products.dbUtil.DataBaseUtil;
import com.products.model.LoginInfo;

/**
 * @author dstar - LoginDAO is used to authenitcate the user, it gets the
 *         userDetails object and it tries to fetch the record in DB with same
 *         user name and password, If the record is fetchec it authenticates
 *         user else not
 *
 */
public class LoginDAO {

	public static boolean isValidUser (LoginInfo userDetails) {
		
		boolean isValidUser = false;

		try {

			Connection connection = DataBaseUtil.getConnection();
			// using Statment and not preparedStatment because we are just gonna fetch a
			// single user name recored
			Statement statement = connection.createStatement();
			// this is a way to append variable to query statements
			ResultSet resultSet = statement.executeQuery("SELECT * FROM login_info WHERE user_name = '"
					+ userDetails.getUserName() + "' AND password = '" + userDetails.getPassword() + "'");

			while (resultSet.next()) {
				// we are directly returning true because, we are building query to only fetch
				// the user with username & password we get from view.
				// If the details enetered in the view is right then only a record will be
				// fetched from DB, so the only fethcable record in DB is the right one and if
				// we fetch one with matching user_name and password then its a valid user.
				// thats why we are authenticating just because out query fetched a record
				isValidUser = true;
			}

			DataBaseUtil.closeConnection(connection);

		} catch (SQLException e) {
			System.out.println("Error Encountered while creating Statement object in LoginDAO");
			e.printStackTrace();

		}

		return isValidUser;
	}
}
