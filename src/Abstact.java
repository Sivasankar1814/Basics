abstract class Animal{
	public void dribnk() {
		System.out.println("Every animal requied water to drink");		
	}
	abstract public void sound();
	abstract public void movement();	
}
class lion extends Animal{

	@Override
	public void sound() {
		System.out.println("rorrarrar");
		
	}
	@Override
	public void movement() {
		System.out.println("walk/run");
	}
	
}
public class Abstact {

	public static void main(String[] args) {
		Animal animal;
		animal=new lion();
		animal.sound();
		animal.movement();
	}

}
