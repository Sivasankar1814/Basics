package basics;

import java.util.Scanner;

public class Fibrange {

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter range");
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a=0,b=1,c;
		while(a<=m) {
			if(a>=n)System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}
}
