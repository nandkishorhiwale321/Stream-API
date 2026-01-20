package api;

import java.util.Comparator;
import java.util.List;

public class First {
	public static void main (String [] args) {
		
	Integer a =List.of(10,11,31,55,02,85,65)
	.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
	
	System.out.println(a);
	}

}
