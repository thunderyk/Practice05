package com.javaex.ex02;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
		
	}//빈거 생성자가 없어서 에러남
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;	
	}
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:"+name+", 가격:"+price);
	}
}




