package Ptactice12;

import java.util.Scanner;

public class WordscountWithoutinbuilt {

	public static void main(String[] args) {
    String s="java is oops, lang>?";
    Scanner scn = new Scanner(s);
    int totalwordcount=0;
    while(scn.hasNext()) {
    	String next=scn.next();
    	totalwordcount++;
    	int length=length(next);
    	//System.out.println(next+":"+length+"");
    }
    System.out.println(totalwordcount);
	}
  public static int length(String next) {
	  int count=0;
	  Scanner scn1 = new Scanner(next);
	  scn1.useDelimiter("");
	  while(scn1.hasNext()) {
		  scn1.next();
		  count++;
	  }
	  return count;
  }
	
	
}
