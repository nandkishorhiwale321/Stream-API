package groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Six {

	public static void main(String[] args) {
		
		
		List<String> list=List.of("nanda","omkar","galere","mam");
		
		Map<Integer,List<String>> mp= list
				.stream()
				.collect(Collectors
						.groupingBy((i)->{return i.length();}));
		
		System.out.println(mp);
	}

}
