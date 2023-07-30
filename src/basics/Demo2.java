package basics;
class sankar{
	int s;
	public void m1() {
		int m=1;
		System.out.println(m);
		System.out.println(this.s);
		
	}
	
}
public class Demo2 {
	public static void main(String[] args) {
	sankar d = new sankar();
	d.s=10;
	d.m1();
	}
}
