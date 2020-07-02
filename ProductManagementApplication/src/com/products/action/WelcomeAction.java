package com.products.action;

import java.text.SimpleDateFormat;
import java.util.Date;
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
	private String productName;
	private String productCategory;
	private Date createdDate;

	public void initializeProductList() {
		System.out.println("*****Filter Data*****");
		System.out.println(productName);
		System.out.println(productCategory);
		System.out.println(createdDate);
		String createdDateString = "";
		if (createdDate != null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
			createdDateString = dateFormat.format(createdDate);
		}
		products = ProductManagementDAO.getAllProduct(this.productName, this.productCategory, createdDateString);
//		for (Product element : products) {
//			System.out.println(element);
//		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
