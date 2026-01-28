package method_ref;

import java.util.List;

public class MethodRef_3 {
	public static void main(String [] args) {
		int  sum =List.of(10,20,22,14,65,30,47,26).stream()
		.filter((i)->{return i%2==0;})
		.reduce(A::aa);
		
		System.out.println(sum);
		
		
		/*
		 * int sum = List.of(10,20,22,14,65,30,47,26).stream()
    .filter(i -> i % 2 == 0)
    .reduce(0, A::aa);

System.out.println(sum);

		 */
	}

}
class A{
	
	public static int aa(int s, int r) {
		return s+r;
	}
	
	
}