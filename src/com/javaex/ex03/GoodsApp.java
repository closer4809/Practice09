package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

	List<Goods> gList = new ArrayList<Goods>();
    Scanner sc = new Scanner(System.in);	
    
    System.out.println("상품을 입력해주세요(종료 q)");	
    
    
	 do{
         String a = sc.nextLine(); // Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받습니다.
         System.out.println("입력받은 수 : " + a);  
     }while(a);  // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.

     System.out.println("반복문 종료");
    }
	
	
	
	
	sc.close();
    
    }

}
