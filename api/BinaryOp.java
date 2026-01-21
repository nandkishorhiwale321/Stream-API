package api;

import java.util.function.BinaryOperator;

public class BinaryOp {

	public static void main(String[] args) {
	  
		BinaryOperator<String> bio=(k ,m)->{return k+m;};
		
		System.out.println(bio.apply("nanda", "patil"));
		
		
		

	}

}
