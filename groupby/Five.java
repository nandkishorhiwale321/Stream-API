package groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Five {
	public static void main (String [] args) {
		
	List<String> str=List.of( "abcd","gik","ipoairh","ksjh","kkska");
	Map<Object, List<String>> map= str.stream()
			.collect(Collectors.groupingBy((i)->{ return i.contains("a"); }));
	
	System.out.println(map);
		}
	}

