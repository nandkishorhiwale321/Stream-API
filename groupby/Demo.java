package groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
	public static void main (String [] args) {
		
		List<String> list = List.of("nanf","jujufh","ejjhkhkfk","ccjnvnkju","icuhvbkb");
		Map<Object,List<String>>  map = list.stream()
		.collect(Collectors.groupingBy((i)->{return i.contains("a");}));
		
		System.out.println(map);
	}

}
