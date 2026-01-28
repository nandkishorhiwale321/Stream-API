package groupby;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class one {
	public static void main(String []args) {
	Map<Integer,String> mp =List.of("yuvraj","karan","vihajjjjjjn","syama")
	.stream().collect(Collectors.toMap(String::length,String::new,(first,second)->{return second; }));
	
	System.out.println(mp);
	}

}
