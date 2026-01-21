package api;

import java.util.Comparator;
import java.util.List;

public class Second {
	public static void main (String [] args) {
		/*
		 * find lowest number in the list
		 */
		
		List.of(10,20,3,22,66,54,88,99,72)
		.stream()
		.sorted().limit(1)
		.forEach((i)->{System.out.println(i);});
		
	}

}
