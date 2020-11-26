package com.javaex.ex11;

import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {
    	boolean run=true;
    	
        Book[] books = new Book[10];

        books[0] = new Book(1, "트와일라잇", "스테파니메이어");
        books[1] = new Book(2, "뉴문", "스테파니메이어");
        books[2] = new Book(3, "이클립스", "스테파니메이어");
        books[3] = new Book(4, "브레이킹던", "스테파니메이어");
        books[4] = new Book(5, "아리랑", "조정래");
        books[5] = new Book(6, "젊은그들", "김동인");
        books[6] = new Book(7, "아프니깐 청춘이다", "김난도");
        books[7] = new Book(8, "귀천", "천상병");
        books[8] = new Book(9, "태백산맥", "조정래");
        books[9] = new Book(10, "풀하우스", "원수연");

        System.out.println("*****도서 정보 출력하기******");
        displayBookInfo(books);
        
        Scanner scanner = new Scanner(System.in);
        
        int count=0;
        while(run){
            System.out.println("");
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.도서 대여(동시 3권까지 가능) | 2.도서 반납 | 3.도서 현황 |4.종료");
            System.out.println("-----------------------------------------------------------");
            System.out.print("선택> ");     
            int menuNo = scanner.nextInt();
            int num;
            switch(menuNo){
            
                case 1:
                	if(count>=3) {
                		System.out.println("동시에 3권까지만 가능합니다. 책을 반납해 주세요");
                	}else {
                		System.out.print("대여 하고 싶은 책의 번호를 입력하세요: ");
                		num = scanner.nextInt();
                		books[num-1].bookRent();
                		count++;
                	}
                    break;
                
                case 2:
                	System.out.print("반납 하고 싶은 책의 번호를 입력하세요: ");
                    num = scanner.nextInt();
                    books[num-1].bookReturn();
                    count--;
                    break;
                    
                case 3:
                    System.out.println("*****도서 정보 출력하기******");
                    displayBookInfo(books);
                    break;
                
                case 4:
                    System.out.print("프로그램 종료");
                    run = false;
                    break;
                    
                default :
                    System.out.println("다시입력해주세요");
                    break;
                    
            }//switch             
        }//while
        
        scanner.close();
    }

    //(2)전달받은 배열을 모두 출력하는 메소드
    private static void displayBookInfo(Book[] books) {
        
    	for(int i=0;i<books.length;i++) {
    		books[i].print();
    	}
    }
}
