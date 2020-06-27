/**
 * 
 */
package com.products.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.products.dbUtil.DataBaseUtil;
import com.products.model.Product;

/**
 * @author dstar - ProductManagementDAO is used for multple operations on
 *         product table like fetching adding deleating, etc.
 *
 */
public class ProductManagementDAO {

	public static List<Product> getAllProduct() {

		List<Product> productList = new ArrayList<>();

		try (Connection connection = DataBaseUtil.getConnection()) {

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM product");

			while (resultSet.next()) {
				productList.add(new Product(resultSet.getString("prod_id"), resultSet.getString("prod_name"),
						resultSet.getString("prod_category"), resultSet.getInt("prod_price")));

			}

		} catch (SQLException e) {

			System.out.println("Error encountered while creating statement object in ProductManagementDAO");
			e.printStackTrace();

		}

		return productList;
	}

	public static Product getProductById(String productId) {

		Product product = null;

		try (Connection connection = DataBaseUtil.getConnection()) {

			PreparedStatement prepStatement = connection.prepareStatement("SELECT * FROM product WHERE prod_id = ?");
			prepStatement.setString(1, productId);
			ResultSet resultSet = prepStatement.executeQuery();
			while (resultSet.next()) {
				product = new Product(productId, resultSet.getString("prod_name"), resultSet.getString("prod_category"),
						resultSet.getInt("prod_price"));
			}
		} catch (SQLException e) {

			System.out.println("Error while getting product by productId");
			e.printStackTrace();

		}

		return product;

	}

	public static int addProduct(Product product) {

		int status = 0;
		// modified to use try with resources
		try (Connection connection = DataBaseUtil.getConnection()) {

			PreparedStatement prepStatement = connection.prepareStatement("INSERT INTO product VALUES(?, ?, ?, ?) ");
			prepStatement.setString(1, product.getProductId());
			prepStatement.setString(2, product.getProductName());
			prepStatement.setString(3, product.getProductCategory());
			prepStatement.setInt(4, product.getProductPrice());
			status = prepStatement.executeUpdate();

		} catch (SQLException e) {

			System.out.println("Error occured at creating prepared statement for addProduct()");
			e.printStackTrace();
		}

		return status;
	}

	public static int updateProduct(Product product) {

		int status = 0;
		// modified to use try with resources
		try (Connection connection = DataBaseUtil.getConnection()) {
			PreparedStatement prepStatement = connection.prepareStatement(
					"UPDATE product SET prod_name = ?, prod_category = ?, prod_price = ? WHERE prod_id = ?");
			prepStatement.setString(1, product.getProductName());
			prepStatement.setString(2, product.getProductCategory());
			prepStatement.setInt(3, product.getProductPrice());
			prepStatement.setString(4, product.getProductId());
			status = prepStatement.executeUpdate();

		} catch (SQLException e) {

			System.out.println("Error occured while updating product details");
			e.printStackTrace();

		}
		
		return status;
	}

	public static int deleteProduct(String productId) {
		int status = 0;

		// modified to use try with resources
		try (Connection connection = DataBaseUtil.getConnection()) {
			PreparedStatement prepStatement = connection.prepareStatement("DELETE FROM product WHERE prod_id =?");
			prepStatement.setString(1, productId);
			status = prepStatement.executeUpdate();

		} catch (SQLException e) {

			System.out.println("Exception occured while deleting a product ");
			e.printStackTrace();
		}

		return status;
	}
}
