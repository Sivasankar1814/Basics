import java.util.ArrayList;
import java.util.Scanner;

public class Abcd {
   public static void main(String[] args) {
	System.out.println(fact(5));
}
   public static int fact(int i) {
	if(i==1)return 1;
	else {
		return i*fact(i-1);
	}
}
}
