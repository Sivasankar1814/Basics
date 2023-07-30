
public class Demo {
public static void main(String[] args) {
	String s="iam die hard fan of virat kohli.classical batsman";
	int count=0;
	String s1="";
//	for(int i=0;i<s.length();i++) {
//		if(s.charAt(i)=='.'||s.length()-1==i)count++;
//	}
//	System.out.println(count);	
	String s2="";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c!='.') {
			s1+=s.charAt(i);
		}
		else {
	if(s1.length()>=count) {
		count=s1.length();
		s2=s1;	
	}
   s1="";
		}	
	}
	System.out.println(s2);
	}
}
