package Placementclass;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ReplaceDupli {
	public static void main(String[] args) {
     LinkedHashSet<Object> l1 = new LinkedHashSet<>();
    String s="java";
    Scanner scn = new Scanner(s);
    scn.useDelimiter(" ");
    while(scn.hasNext()) {
    	l1.add(scn.next());
    }
    System.out.println(l1);
	}
}
