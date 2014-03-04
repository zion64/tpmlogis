package com.tpmlogis.bssapp.model;

// Generated 2014. 3. 4 ���� 4:41:59 by Hibernate Tools 4.0.0

/**
 * Orderdetails generated by hbm2java
 */
public class Orderdetails implements java.io.Serializable {

	private OrderdetailsId id;
	private Orders orders;
	private Products products;
	private int quantityOrdered;
	private double priceEach;
	private short orderLineNumber;

	public Orderdetails() {
	}

	public Orderdetails(OrderdetailsId id, Orders orders, Products products, int quantityOrdered, double priceEach, short orderLineNumber) {
		this.id = id;
		this.orders = orders;
		this.products = products;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
	}

	public OrderdetailsId getId() {
		return this.id;
	}

	public void setId(OrderdetailsId id) {
		this.id = id;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public int getQuantityOrdered() {
		return this.quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach() {
		return this.priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public short getOrderLineNumber() {
		return this.orderLineNumber;
	}

	public void setOrderLineNumber(short orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

}