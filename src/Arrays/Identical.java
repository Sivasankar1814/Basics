package Arrays;

//import java.util.Arrays;
//
//public class Identical {
//
//	public static void main(String[] args) {
//   int [] a= {1,2,3,4,5};
//   int []b= {1,3,4,5,2};
//   boolean s=Arrays.equals(a,b);
//   if(s) {
//	   System.out.println("identical");
//   }
//   {
//	   System.out.println("not identical");
//   }
//	}
//
//}
import java.util.Arrays;

public class Identical {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 5, 4, 3,7};
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        boolean s = Arrays.equals(array1, array2);
       // System.out.println(s);
        
        if (s) {
            System.out.println("The arrays are identical.");
        } else {
            System.out.println("The arrays are not identical.");
        }
    }
}