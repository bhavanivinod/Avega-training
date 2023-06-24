package com.avega.jdbc.model;

public class Product {
private String productCode;
private String productDescription;
private double unitPrice;
private int qoh;
private String category;
public String getProductCode() {
	return productCode;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String productCode, String productDescription, double unitPrice, int qoh, String category) {
	super();
	this.productCode = productCode;
	this.productDescription = productDescription;
	this.unitPrice = unitPrice;
	this.qoh = qoh;
	this.category = category;
}
public void setProductCode(String productCode) {
	this.productCode = productCode;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public int getQoh() {
	return qoh;
}
public void setQoh(int qoh) {
	this.qoh = qoh;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
@Override
public String toString() {
	return "Product [productCode=" + productCode + ", productDescription=" + productDescription + ", unitPrice="
			+ unitPrice + ", qoh=" + qoh + ", category=" + category + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((category == null) ? 0 : category.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (category == null) {
		if (other.category != null)
			return false;
	} else if (!category.equals(other.category))
		return false;
	return true;
}

}
