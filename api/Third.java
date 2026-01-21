package api;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Third {
	public static void main (String [] args) {
		
		List.of(new Employee(101,"Nanda",320021.0),
				new  Employee(102,"Smarth",1350000.01),
				new Employee(103,"Viraj",500000)).stream()
		.sorted((i,j)->{return Double.compare(j.salary, i.salary);}).limit(2)
		.skip(1)
		.forEach((i)->{System.out.println(i);});
		
		
		List<Integer> pricess = List.of(10,20,30,40,50,60);
		BinaryOperator<Integer> value = (i1,i2) -> {return i1+i2;};
		int totall =pricess.stream()     //i1=0   10   i1=10  i2=20 
		.reduce(0, value);
		System.out.println(totall);
		
		
		BiFunction<String , String , Integer> ab = (s1,s2) -> {return s1.length()+s2.length();};
		
		Function<Integer , String> ab1=(s3) -> {return s3.toString();};
		
		BiFunction<String,String,String> obj = ab.andThen(ab1);
		
		System.out.println(obj.apply("anand", "nandKishor"));
		
		
		
		
		
	}

}
class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String  toString() {
		return this.id+" "+this.name+" "+this.salary;
		
	}
}
