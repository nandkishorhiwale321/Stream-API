package method_ref;

import java.util.Arrays;
import java.util.List;

public class logical_01 {
	public static void main (String [] args) {
		
		List<String> list =Arrays.asList("madhuri","oma");
		List<String> list2= Arrays.asList("madhuri","oma");
		
		List<List<String>> list3=Arrays.asList(list,list2);
				
		System.out.println(list3);
				
//		List<String> list3 =List.of("madhuri","oma");
//		List<String> list4 =List.of("madhuri","oma");
//		
//		List<List<List<List<List<String>>>>> list5 =
//		
//	      list3.stream().flatMap((i)-> {return i.stream();})
//	      .reduce((k,j)->{return k+j;}).forEach((i)->{System.out.println(i)};);
//		
		
	}

}
