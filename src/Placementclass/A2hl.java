package Placementclass;

import java.util.Scanner;

public class A2hl {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		System.out.println("enter number");
		int n=scn.nextInt();
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=i;j++) {
     		if(i==n||j==1||j==i) {
     			System.out.print("* ");
     		}
     		else {
     			System.out.print("  ");
     		}
    	}
    	System.out.println();	
     }
	}

}
