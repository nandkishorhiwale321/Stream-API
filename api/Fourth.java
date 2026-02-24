package api;

import java.util.List;

public class Fourth {
	public static void main (String [] args) {
		
		List.of(0,120,65,88,4454,5555).stream()
		.sorted().limit(6).skip(5)
		.forEach((i)->{System.out.println(i);});;
	}

}
