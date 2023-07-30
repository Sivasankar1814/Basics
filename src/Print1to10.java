import java.util.Scanner;

public class Print1to10 {

	public static void main(String[] args) {
    String s="java is oops lang ";
//    int count=0;
//    for(int i=0;i<s.length()-1;i++) {
//    	if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')count++;
//    }
//    System.out.println(count+1);
    
    Scanner scn = new Scanner(s);
    scn.useDelimiter(" ");
    int count=0;
    while(scn.hasNext()) {
    	System.out.println(scn.next());
    	count++;
    }
    System.out.println(count);
	}
	
		


}
