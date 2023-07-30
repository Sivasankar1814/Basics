package Ptactice12;

public class WordCount {

	public static void main(String[] args) {
    String s="java, is nithya beautiful sol hi uo he456";
    int count=1;
    for(int i=0;i<s.length();i++) {
    	if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
    	count++;
    }
    }
    System.out.println(count);
	}

}
