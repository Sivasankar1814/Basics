
public class Nextpalindrome {

	public static void main(String[] args) {
		int n=707;
		n++;
		while(true) {
			int t=n;
			int reverse=0;
		while(t!=0) {
			 int rem=t%10;
			 reverse=(reverse*10)+rem;
			 t/=10;
		}
		
		if(reverse==n) {
			System.out.println(reverse);
			break;
		}
		else {
			n++;					
			
		}
		}
	}
}