package Ptactice12;

import java.util.Arrays;

public class B {

	public static void main(String[] args) {
   int [] a= {1,2,3,4,5};
   int [] b= {1,3,2,5,4,8};
   Arrays.sort(a);
   Arrays.sort(b);
   
   boolean flag=true;
   if(a.length!=b.length) {
	   flag=false;
   }
   else {
	   for(int i=0;i<a.length;i++) {
		   if(a[i]!=b[i]) {
			   flag=false;
			   break;
		   }
	   }
   }
   if(flag) {
	   System.out.println("identical");
   }
   else {
	   System.out.println("Not identical");
   }
	}

}
