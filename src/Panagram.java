import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Panagram {
	public static void main(String[] args) {
		String s="abcd efghi jklmn3 opqrst6 uvwxyz";
		Set<Object>s1 = new LinkedHashSet<>();
		int i=0;
		while(i<s.length()) {
			char c=s.charAt(i++);
			if(c!=' ')s1.add(c);
		}
		System.out.println(s1.size());
		if(s1.size()!=26)System.out.println("Not panagram");
		else System.out.println("panagram");		
	}
}
