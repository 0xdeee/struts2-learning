/**
 * 
 */
package com.products.action;

import com.opensymphony.xwork2.ActionSupport;
import com.products.DAO.ProductManagementDAO;
import com.products.model.Product;

/**
 * @author dstar - This method is used to update the product
 *
 */
public class UpdateProductAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String productId;
	private String productName;
	private String productCategory;
	private Integer productPrice;

	public UpdateProductAction() {
		super();
	}

	public UpdateProductAction(String productId, String productName, String productCategory, Integer productPrice) {
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

		Product product = ProductManagementDAO.getProductById(productId);
		productName = product.getProductName();
		productCategory = product.getProductCategory();
		productPrice = product.getProductPrice();
		return SUCCESS;
	}
}
