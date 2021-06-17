package com.javaex.ex02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FriendApp {

    public static void main(String[] args) {
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("친구를 3명 등록해주세요");

    	for(int i = 0; i <3; i++) {
         	String a = sc.nextLine();
         	String[] sArray = a.split(" ");
    	
         	Friend people = new Friend();		
        	people.setName(sArray[0]);
        	people.setHp(sArray[1]);
        	people.setSchool(sArray[2]);
        	
        	fList.add(people);	
        }
    	
    	
    	for(int i=0;i<fList.size();i++) {
			
			fList.get(i).showInfo();
		}
	
    	
    	
    	
    	
    	
    	
    	sc.close();
    	
    }

}
