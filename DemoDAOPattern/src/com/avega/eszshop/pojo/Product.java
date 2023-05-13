package com.avega.eszshop.pojo;

import java.time.LocalDate;

public class Product {
private String id;
private String description;
private double price;
private LocalDate mfgDate;
private LocalDate expDate;
private int qty_on_hand;
private int reorder_level=3;
/**
 * @return the id
 */
public String getId() {
	return id;
}
@Override
public String toString() {
	return "Product [id=" + id + ", description=" + description + ", price=" + price + ", mfgDate=" + mfgDate
			+ ", expDate=" + expDate + ", qty_on_hand=" + qty_on_hand + ", reorder_level=" + reorder_level + "]";
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}
/**
 * @return the mfgDate
 */
public LocalDate getMfgDate() {
	return mfgDate;
}
/**
 * @param mfgDate the mfgDate to set
 */
public void setMfgDate(LocalDate mfgDate) {
	this.mfgDate = mfgDate;
}
/**
 * @return the expDate
 */
public LocalDate getExpDate() {
	return expDate;
}
/**
 * @param expDate the expDate to set
 */
public void setExpDate(LocalDate expDate) {
	this.expDate = expDate;
}
/**
 * @return the qty_on_hand
 */
public int getQty_on_hand() {
	return qty_on_hand;
}
/**
 * @param qty_on_hand the qty_on_hand to set
 */
public void setQty_on_hand(int qty_on_hand) {
	this.qty_on_hand = qty_on_hand;
}
/**
 * @return the reorder_level
 */
public int getReorder_level() {
	return reorder_level;
}
/**
 * @param reorder_level the reorder_level to set
 */
public void setReorder_level(int reorder_level) {
	this.reorder_level = reorder_level;
}
public Product(String id, String description, double price, LocalDate mfgDate, LocalDate expDate, int qty_on_hand,
		int reorder_level) {
	super();
	this.id = id;
	this.description = description;
	this.price = price;
	this.mfgDate = mfgDate;
	this.expDate = expDate;
	this.qty_on_hand = qty_on_hand;
	this.reorder_level = reorder_level;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}

}
