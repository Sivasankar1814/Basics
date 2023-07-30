package Placementclass;

public class Duplicate {

	public static void main(String[] args) {
   String s1="anbdcdanba";
   int max=0;
   char c1=' ';
   while(s1.length()>0) {
	   char c=s1.charAt(0);
	   String s2=s1.replace(c+"","");
	   int count=s1.length()-s2.length();
	   if(max<count) {
		   max=count;
		   c1=c;
	   }
	  s1=s2; 
   } 
   System.out.println(c1+""+max);
	}
}
