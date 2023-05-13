package com.avega.eszshop.pojo;

import java.util.Map;

public class Store {
String storeId;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
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
	Store other = (Store) obj;
	if (storeId == null) {
		if (other.storeId != null)
			return false;
	} else if (!storeId.equals(other.storeId))
		return false;
	return true;
}
public Store() {
	super();
	// TODO Auto-generated constructor stub
}
public Store(String storeId, String storeName, String address, Map<String, Product> products) {
	super();
	this.storeId = storeId;
	this.storeName = storeName;
	this.address = address;
	this.products = products;
}
@Override
public String toString() {
	return "Store [storeId=" + storeId + ", storeName=" + storeName + ", address=" + address + ", products=" + products
			+ "]";
}
/**
 * @return the storeId
 */
public String getStoreId() {
	return storeId;
}
/**
 * @param storeId the storeId to set
 */
public void setStoreId(String storeId) {
	this.storeId = storeId;
}
/**
 * @return the storeName
 */
public String getStoreName() {
	return storeName;
}
/**
 * @param storeName the storeName to set
 */
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the products
 */
public Map<String, Product> getProducts() {
	return products;
}
/**
 * @param products the products to set
 */
public void setProducts(Map<String, Product> products) {
	this.products = products;
}
String storeName;
String address;
Map<String,Product> products;




}
