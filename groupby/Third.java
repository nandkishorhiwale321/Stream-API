package groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Third {
	public static void main (String [] args) {
		
		Map<Integer,List<String>> mp = List.of("nanda","kanha","vedu","nivas")
		.stream()
		.collect(Collectors.groupingBy((i)->{return i.length();}));
		
		System.out.println(mp);
	}

}
