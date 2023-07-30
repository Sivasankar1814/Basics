interface Vechicle{
	 void start();
	 void stop();	 
 }
 class Car implements Vechicle{
	 public void start() {
		System.out.println("car1 startd");
	}
	@Override
	public void stop() {
		System.out.println("car1 stop");	
	}
 }
public class Inter {
public static void main(String[] args) {
	Car c = new Car();
	c.start();
	c.stop();
}
}
