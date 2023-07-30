package basics;
class Appu{
	Appu(){
		System.out.println("hi siva");
	}
	Appu(int m){
		this();
		System.out.println(m);
	}
}
class Pj extends Appu{
	int n;
	Pj(int n){
		super(10);
		this.n=n;
		System.out.println(n);
	}
}
public class Demo3 {
	public static void main(String[] args) {
		new Pj(100);
	}

}
