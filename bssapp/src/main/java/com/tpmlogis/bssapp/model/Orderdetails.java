package com.tpmlogis.bssapp.model;

// Generated 2014. 3. 4 ?? 10:20:32 by Hibernate Tools 4.0.0

/**
 * Orderdetails generated by hbm2java
 */
public class Orderdetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6791966787649129264L;
	private OrderdetailsId id;
	private Integer version;
	private int quantityordered;
	private double priceeach;
	private int orderlinenumber;

	public Orderdetails() {
	}

	public Orderdetails(OrderdetailsId id, int quantityordered, double priceeach, int orderlinenumber) {
		this.id = id;
		this.quantityordered = quantityordered;
		this.priceeach = priceeach;
		this.orderlinenumber = orderlinenumber;
	}

	public OrderdetailsId getId() {
		return this.id;
	}

	public void setId(OrderdetailsId id) {
		this.id = id;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public int getQuantityordered() {
		return this.quantityordered;
	}

	public void setQuantityordered(int quantityordered) {
		this.quantityordered = quantityordered;
	}

	public double getPriceeach() {
		return this.priceeach;
	}

	public void setPriceeach(double priceeach) {
		this.priceeach = priceeach;
	}

	public int getOrderlinenumber() {
		return this.orderlinenumber;
	}

	public void setOrderlinenumber(int orderlinenumber) {
		this.orderlinenumber = orderlinenumber;
	}

}
