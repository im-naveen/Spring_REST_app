package com.lti.app.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tempproduct001")
public class Product {
	
	@Id
	@Column(name="productid")	
	private String prodid;
	private String prodname;
	private String price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Product(String prodid, String prodname, String price) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.price = price;
	}

	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
}
