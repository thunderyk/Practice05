package com.javaex.ex01;

public class MemberApp {

	public static void main(String[]args) {
		Member jws = new Member();
		Member yjs = new Member();
		Member lhr = new Member();
		
		jws.setId("jws");
		jws.setName("정우성");
		jws.setPoint(50000);
		
		yjs.setId("yjs");
		yjs.setName("유재석");
		yjs.setPoint(30000);
		
		lhr.setId("lhr");
		lhr.setName("이효리");
		lhr.setPoint(40000);
		
		System.out.println("회원정보: "+jws.getName()+"("+jws.getId()+"), "+jws.getPoint()+"점");
		System.out.println("회원정보: "+yjs.getName()+"("+yjs.getId()+"), "+yjs.getPoint()+"점");
		System.out.println("회원정보: "+lhr.getName()+"("+lhr.getId()+"), "+lhr.getPoint()+"점");
	}
}
