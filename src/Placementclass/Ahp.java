package Placementclass;

import java.util.Scanner;

public class Ahp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		System.out.println("enter number");
		int n=scn.nextInt();
     for(int i=1;i<=n;i++) {
    	for(int j=1;j<i;j++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=n-i+1;j++) {
    		if(i==1||j==1||j==n-i+1) {
    			System.out.print("*");
    		}
    		else {
    			System.out.print(" ");
    		}
    	}
    	System.out.println();	
     }
	}
}
