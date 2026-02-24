package api;

import java.util.List;

public class Prac_01 {
	public static void main (String [] args) {
		
		List.of("Nanda","Aniket").stream().map(StringBuffer::new).map(StringBuffer::reverse).forEach((i)->{System.out.println(i);});;
	}

}
