package Optional_Class;

import java.util.Optional;

public class Second {
	public static void main (String [] args) throws Exception {
		
		
		Optional<String> ops = Optional.empty();
		
		ops.ifPresent((i)->{System.out.println(i.toUpperCase());});
		ops.ifPresentOrElse((i)->{System.out.println(i.length());},
				()->{System.out.println(" no value herer");});
		
		
		
		System.out.println(ops.orElseThrow());
		System.out.println(ops.orElseThrow(()-> new RuntimeException("kk")));
	}

}
