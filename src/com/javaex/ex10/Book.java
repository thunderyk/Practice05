package com.javaex.ex10;

public class Book {
    
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;
    
    public Book() {
    	
    }
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	stateCode = 1;
    }
    
    public void rent() {
    	if(stateCode == 0) {
    		System.out.println("이미 대여중입니다.");
    	}else {
    		System.out.println(title+"이(가) 대여되었습니다.");
    		stateCode=0;
    	}
    }
    
    public void print() {
    	String state;
    	if(this.stateCode==0) {
    		state="대여중";
    	}else {
    		state="재고있음";
    	}
    	System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+", 대여 유무:"+state);
    }
	public int getBookNo() {
		return bookNo;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
    
}
