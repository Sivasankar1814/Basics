package Ptactice12;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
    String s="java$ is% a, oops& lang";
    Scanner scn = new Scanner(s);
    int count=0;
    while(scn.hasNext()) {
    	System.out.println("siva");
    	scn.next();
    	count++;
    }
    System.out.println(count);
	}

}
