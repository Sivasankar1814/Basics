package Placementclass;

public class P2 {
 public static void main(String[] args) {
 String s1="He soon joined the senior Men in Blue in Sri Lanka. come August 2008. In the absence of the regular openers.Virat Kohli was given a chance to open the batting in the ODI series. He played some commendable knocks in his extended run as an opener.as India went on to win the ODI series. However the established and formidable pair of Tendulkar and Sehwag kept Kohli out of the team";
  String s2="";
  String s3="";
  int count=0;
  for(int i=0;i<s1.length()-1;i++) {
	  if(s1.charAt(i)!='.') {
		  s2+=s1.charAt(i);
	  }
	  else{
		  if(s2.length()>=count) {
			  count=s2.length();
			  s3=s2;
		  }
		  s2="";
	  }
  }
  System.out.println(s3);
	}
}
