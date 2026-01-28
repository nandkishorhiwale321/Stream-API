package api;

import java.util.Arrays;
import java.util.List;

public class second1 {

	public static void main(String[] args) {

		
		 List<String> list= Arrays.asList("abc","avc","kkjdj");
		 List<String> list2= Arrays.asList("abc","avc","kkjdj");
		 List<String> list3= Arrays.asList("abc","avc","kkjdj");
		 List<String> list4= Arrays.asList("abc","avc","kkjdj");
		 
		 List<List<String>>list5=Arrays.asList(list,list2);
		 List<List<String>>list6=Arrays.asList(list3,list4);
		 
		 List<List<List<String>>>list7=Arrays.asList(list5,list6);
		 System.out.println(list7);
		  
		 
	int sum=	 list7.stream()
		 .flatMap(i->i.stream())
		 .flatMap(i->i.stream())
		 .map(i->new String(i).length())
		 .reduce(0,(i,j)->(i+j));
		 
					  System.out.println(sum);
	}


}
