package api;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunction_1 {
	public static void main (String [] args) {
		BiFunction<String,String,Integer> bi=(i,j)->{return i.length()+j.length();};
		System.out.println(bi.apply("nanda", "patil"));

BinaryOperator<String> bio=(k ,m)->{return k+m;};
		
		System.out.println(bio.apply("nanda", "patil"));
		
		
	}

}
