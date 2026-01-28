package method_ref;

import java.util.List;

public class Instance_method_ref {
	public static void main (String [] args ) {
		
		instanceMethRef in = new instanceMethRef();
		
		List.of(10,2,3,1,8,9,99,54,
				5,45,20,50,65,56,88,97,54).stream().filter(in :: even)
		.forEach((i)->{System.out.println(i);});
		
	}

}
class instanceMethRef {
	
	public boolean even(int a) {
		return a%2==0;
	}
	
}
