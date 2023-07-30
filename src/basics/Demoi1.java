package basics;
 class M{
	 M(int d){
		 System.out.println(d);
	 } 
 }
 class N extends M
 {
	 int a;
	 N(int a){
		 super(10);
		 this.a=a;
		 System.out.println(a);
	 }
 }
public class Demoi1 {
	public static void main(String[] args) {
		new N(100);
	}

}
