package com.bean;


public class Product {
	private int pid;
	private String pname;
	private float price;
	private String url;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		String details = " [Product Id: " + pid + ", Product name: " + pname + ", Product price: " + price + ", Product URL:" + url + "]";
		return details;
	}
	
	

}
