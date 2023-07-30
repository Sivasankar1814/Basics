import java.util.Scanner;

public class M {

	public static void main(String[] args) {
    int i=1001;
    int counts=0;
    int countn=0;
    while(i>0) {
    	int rem=i%10;
    	System.out.println("remender"+rem);
    	if(rem==1) {
    		counts++;
    	}
    	else if(rem==0) {
    		countn++;
    	}
    	i/=10;
    	System.out.println("i value"+i);
    	 	
    }
    System.out.println("counts zeros"+counts);
    System.out.println("counts 1s"+countn);
	}
	
}
