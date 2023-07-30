package Ptactice12;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
    int [] a= {1,2,3,4,5};
    int [] b= {1,2,4,3,5,8};
    Arrays.sort(a);
    Arrays.sort(b);
    boolean flag=Arrays.equals(a,b);
    System.out.println(flag);
    if(flag) {
    	System.out.println("Identical");
    }
    else {
    	System.out.println("Not identical");
    }
	}

}
