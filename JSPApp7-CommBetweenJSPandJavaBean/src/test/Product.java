package test;

import java.io.Serializable;

public class Product implements Serializable
{
	
	private String pCode;
	private String pName;
	private float pPrice;
	private int pQty;
	
	public String getpCode() {
		return pCode;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public float getpPrice() {
		return pPrice;
	}
	
	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	
	public int getpQty() {
		return pQty;
	}
	
	public void setpQty(int pQty) {
		this.pQty = pQty;
	}
	
}
