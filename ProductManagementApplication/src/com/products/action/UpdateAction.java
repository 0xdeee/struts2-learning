/**
 * 
 */
package com.products.action;

import com.opensymphony.xwork2.ActionSupport;
import com.products.DAO.ProductManagementDAO;
import com.products.model.Product;

/**
 * @author dstar
 *
 */
public class UpdateAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String productId;
	private String productName;
	private String productCategory;
	private Integer productPrice;

	public UpdateAction() {
		super();
	}

	public UpdateAction(String productId, String productName, String productCategory, Integer productPrice) {
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
		// we are passing created date param as null because we dont want others to
		// alter the date a product entry is created & we are not going to include it in
		// the udpdateProduct.jsp too
		Product product = new Product(productId, productName, productCategory, productPrice, null);
		int status = ProductManagementDAO.updateProduct(product);
		if (status == 1) {
			return SUCCESS;
		}
		return ERROR;
	}

}
