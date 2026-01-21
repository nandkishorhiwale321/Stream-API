package method_ref;

import java.util.List;

public class Static_Method_ref {
	
	public static void main (String [] args) {
		
		
	List.of(10,20,50,60,23,65,4,40).stream().filter(Demo :: show)
	.forEach(Demo::print);
	
		}	
		
	}

class Demo {
	
	static boolean show(int a) {
		return a>30;
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
}


