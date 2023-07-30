package basics;
class T{
	public void name() {
		System.out.println("hi siva");
	}
}
class D extends T
{
	public void shortname() {
		System.out.println("hi sankar")	;
	}
	
}
public class Siva {

	public static void main(String[] args) {
    D d = new D();
    d.name();
    d.shortname();
	}

}
