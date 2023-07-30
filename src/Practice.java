
public class Practice {

	public static void main(String[] args) {
		int[]a= {2,5,5,3,9,2,1,9,9,5,7,5,9,9};
		int max=0;
		int n=0;
		for(int i=0;i<a.length-1;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					i=j;
					count++;
				}
			}
		if(count>=max) {
			max=count;
			n=a[i];
		}
			
		}
		System.out.println(n);
	}

}
