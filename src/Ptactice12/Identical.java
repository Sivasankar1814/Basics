package Ptactice12;

import java.util.Arrays;

public class Identical {

	public static void main(String[] args) {
   int[] a= {1,2,3,4,5};
   int[] b= {1,3,2,4,5,8};
   Arrays.sort(a);
   Arrays.sort(b);
    
   boolean flag=Arrays.equals(a, b);
   if(flag)System.out.println("Identical");
   else System.out.println("Not Identical");
  // boolean b1=true;
//  if(a.length!=b.length) {
//	  b1=false;
//  }
//  else {
//  for(int i=0;i<a.length;i++) {
//	  if(a[i]!=b[i]) {
//		  b1=false;
//		  break;
//	  }
//  }
//  }
//   if(b1)System.out.println("Identical");
//   else System.out.println("Not Identical");
	}

}
