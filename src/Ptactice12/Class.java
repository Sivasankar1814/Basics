package Ptactice12;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
    String s="siva& is good7, person";
    int count=1;
    for(int i=0;i<s.length()-1;i++) {
   if(s.charAt(i)==' ')count++;    
   }
    System.out.println(count);
    
    }

}
