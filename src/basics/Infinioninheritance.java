package basics;
class car{
	public void start() {}
	public void accelarate() {}
	public void stop() {}
}
 class swift extends car{
	 public void start() {
		 System.out.println("key start");
	 }
	 public void accelarate() {
		 System.out.println("half clutch drive");
	 } 
	 public void stop() {
		 System.out.println("key stop");
	 }
	 
 }
public class Infinioninheritance {
	public static void main(String[] args) {
    car c;
    c=new swift();
    c.start();
    c.accelarate();
    c.stop();
    
		
		
		
	}

}
