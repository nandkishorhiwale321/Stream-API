package api;

import java.util.List;
import java.util.function.BinaryOperator;

public class Binareyop_2 {
	public static void main (String [] args) {
		
		List<Integer> list = List.of(10,10,10,20,30);
		BinaryOperator<Integer> bi=(i,j)->{return i+j;};
		int total=list.stream().reduce(0, bi);
		System.out.println(total);
	}

}
