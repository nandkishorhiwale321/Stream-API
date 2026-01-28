package groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Second {
	public static void main(String args) {
		Map<Integer,String> mp =List.of("yuvraj","karan","vihan")
		.stream().collect(Collectors.toMap((i)->{return i.length();}, (i)->(i)));
		
		
		System.out.println(mp);
	}
}
