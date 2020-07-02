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
	private String createdDate;

	public UpdateProductAction() {
		super();
	}

	public UpdateProductAction(String productId, String productName, String productCategory, Integer productPrice,
			String createdDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.createdDate = createdDate;
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

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String execute() {

		Product product = ProductManagementDAO.getProductById(productId);
		productName = product.getProductName();
		productCategory = product.getProductCategory();
		productPrice = product.getProductPrice();
		createdDate = product.getCreatedDate();
		return SUCCESS;
	}
}
