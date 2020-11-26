package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       
    	String concat = "";
    	for(int i=0;i<strArray.length;i++) {
    		concat+=strArray[i];
    	}
    	
        //메소드 내용작성
        return concat;
    }

}
