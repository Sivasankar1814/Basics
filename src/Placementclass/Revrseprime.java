package Placementclass;

public class Revrseprime {

	public static void main(String[] args) {
      int n=37;
      int count=0;
      int max=0;
      for(int i=1;i<=n;i++) {
    	  if(n%i==0) {
    		  count++;
    	  }
      }
      if(count==2) {
    	  int revrse=0;
    	  int t=n;
    	  while(t!=0) {
    		 revrse=(revrse*10)+t%10;
    		 t/=10;
    	  }
    	  for(int i=1;i<=revrse;i++) {
    		  if(revrse%i==0) {
    			  max++;
    		  }
    	  }
      }
      if(count==2 && max==2) {
    	  System.out.println("prime number");
      }
      else {
    	  System.out.println("not prime");
      }
	}

}
