package Arrays;
import java.util.Arrays;

public class IdenticalWithoutUsinginbuilt {
	public static void main(String[] args) {
   int []a= {1,2,3,4,5};
   int []b= {1,2,3,5,4};
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
	   System.out.println("Identical");
   }
   else {
	   System.out.println("Not Identical");
   }
	}

}
