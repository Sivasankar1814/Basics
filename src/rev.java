import java.util.ArrayList;
import java.util.*;


public class rev {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
       ArrayList<Integer>numbers = new ArrayList<Integer>();
       System.out.println("Enter numbers");
       int num=scn.nextInt();
       while(num!=-1) {
    	   numbers.add(num);
    	   num=scn.nextInt();
       }
       scn.close();
       int evencount=0;
       for(int n:numbers) {
    	   if(n%2==0) {
    		   evencount++;
    	   }   
       }
       System.out.println(evencount+""+numbers);
	}

}
