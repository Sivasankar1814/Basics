abstract class Animal2{
	public void drink() {
		System.out.println("every animal required water to drink");		
	}
	abstract public void sound();
	abstract public void movment();	
}
class lion1 extends Animal2{

	@Override
	public void sound() {
System.out.println("lion roars");		
	}

	@Override
	public void movment() {
		System.out.println("run/walk");
		
	}	
}
public class A {
public static void main(String[] args) {
	Animal2 a=new lion1();
	a.drink();
	a.sound();
	a.movment();
	
}
}
