package com.products.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.products.DAO.ProductManagementDAO;
import com.products.model.Product;

/**
 * @author dstar - WelcomeAction class will be invokes once the welcome action
 *         is triggered, Here we show the Hello message to the logged-in user
 *         and display th list of products
 *
 */
public class WelcomeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2730066926076764556L;

	List<Product> products;

	public void initializeProductList() {
		products = ProductManagementDAO.getAllProduct();
//		for (Product element : products) {
//			System.out.println(element);
//		}
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String execute() {
		initializeProductList();
		toString();
		return SUCCESS;
	}

	@Override
	public String toString() {
		return "WelcomeAction [productList=" + products + "]";
	}

}
