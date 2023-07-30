package Ptactice12;

import java.util.Scanner;

public class Countword {

	public static void main(String[] args) {
  String s="java is, a oops7 lang";
  int count=0;
  Scanner scn = new Scanner(s);
  while(scn.hasNext()) {
	  scn.next();
	  count++;
  }
  System.out.println(count); 
  
// for(int i=0;i<s.length();i++) {
//	  if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
//		  count++;
//	  }
//  }
//  System.out.println(count);
//  
//  String [] a=s.split(" ");
//  for(int i=0;i<a.length;i++) {
//	  count++;
//  }
//  System.out.println(count);
	}

}
