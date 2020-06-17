/**
 * 
 */
package com.products.action;

import com.opensymphony.xwork2.ActionSupport;
import com.products.DAO.ProductManagementDAO;
import com.products.model.Product;

/**
 * @author dstar - AddProductAction will be triggered when add button is clicked
 *         in addProduct.jsp
 *
 */
public class AddProductAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7829566501829889085L;
	
	private String productId;
	private String productName;
	private String productCategory;
	private Integer productPrice;

	// for returning to struts.xml result tag
	private String statusCode = "";

	public AddProductAction() {
		super();
	}

	public AddProductAction(String productId, String productName, String productCategory, Integer productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
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

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String execute() {
		int status = ProductManagementDAO
				.addProduct(new Product(productId, productName, productCategory, productPrice));

		if (status == 1) {
			statusCode = SUCCESS;
		}
		else {
			statusCode = ERROR;
		}

		return statusCode;
	}

}
