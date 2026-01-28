package Optional_Class;

import java.util.Optional;

public class Second {
	public static void main (String [] args) {
		
		
		Optional<String> ops = Optional.ofNullable("nanda");
		
		ops.ifPresent((i)->{System.out.println(i.toUpperCase());});
		ops.ifPresentOrElse((i)->{System.out.println(i.length());},
				()->{System.out.println(" no value herer");});
	}

}
