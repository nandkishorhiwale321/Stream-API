package groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fourth {
	public static void main (String [] args) {
		/*
		 * find second highest
		 */
		Map<String,List<Employee>> mp =List.of(new Employee("vasu",101,6600.0,"IT"),
				new Employee("leesa",102,6200.2,"IT"),
				new Employee("omkar",103,6520.32,"HR"),
				new Employee("rinku",106,6481.02,"HR")
				
		
				).stream().collect(Collectors.groupingBy(Employee::getdpt));
		
		System.out.println(mp);
		for(Map.Entry<String,List<Employee>> set :mp.entrySet()) {
			
			set.getValue().stream().sorted((i,j)->{return Double.compare(j.salary, i.salary);})
			.limit(2).skip(1).forEach((i)->{System.out.println(i);});
		}
	}

}
class Employee {
	
	String name;
	int id;
	double salary;
	String dpt;
	
	public String getdpt() {
		return dpt;
	}
	public void setdpt(String dpt) {
		this.dpt=dpt;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalaty(double salary) {
		this.salary=salary;
	}
	
	public Employee(String name, int id, double salary,String dpt) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dpt=dpt;
	}
	
	public String toString() {
		return this.name+" "+this.id+" "
				+this.salary+" "+this.dpt;
		
	}
	
}
