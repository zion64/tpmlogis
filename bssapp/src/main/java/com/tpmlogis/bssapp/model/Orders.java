package com.tpmlogis.bssapp.model;

// Generated 2014. 3. 4 ?? 10:20:32 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9009944640269396043L;
	private int ordernumber;
	private Integer version;
	private Customers customers;
	private Date orderdate;
	private Date requireddate;
	private Date shippeddate;
	private String status;
	private String comments;

	public Orders() {
	}

	public Orders(int ordernumber, Customers customers, Date orderdate, Date requireddate, String status) {
		this.ordernumber = ordernumber;
		this.customers = customers;
		this.orderdate = orderdate;
		this.requireddate = requireddate;
		this.status = status;
	}

	public Orders(int ordernumber, Customers customers, Date orderdate, Date requireddate, Date shippeddate, String status, String comments) {
		this.ordernumber = ordernumber;
		this.customers = customers;
		this.orderdate = orderdate;
		this.requireddate = requireddate;
		this.shippeddate = shippeddate;
		this.status = status;
		this.comments = comments;
	}

	public int getOrdernumber() {
		return this.ordernumber;
	}

	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public Date getRequireddate() {
		return this.requireddate;
	}

	public void setRequireddate(Date requireddate) {
		this.requireddate = requireddate;
	}

	public Date getShippeddate() {
		return this.shippeddate;
	}

	public void setShippeddate(Date shippeddate) {
		this.shippeddate = shippeddate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
