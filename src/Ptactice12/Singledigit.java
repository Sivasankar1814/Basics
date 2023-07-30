package Ptactice12;

import java.util.ArrayList;

public class Singledigit {
	public static void main(String[] args) {	
		ArrayList<Object> l = new ArrayList<>();
		int count=0;
		int i=2;
		int n=5;
		while(count<n) {
			
			boolean flag=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}

}
