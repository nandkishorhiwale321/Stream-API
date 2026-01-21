package api;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction_andThen {
	public static void main (String [] args) {
		
		BiFunction<String, String, Integer> bi1= (i,j)->{return i.length()+j.length();};
		Function<Integer,String> bi2=(k)->{return k.toString();};
		BiFunction<String,String,String>b3=bi1.andThen(bi2);
		
		System.out.println(b3.apply("bye", "-bye"));
	}

}
