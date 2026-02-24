package method_ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class prac_02 {
	public static void main (String [] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		System.out.println(Customer.class);
		Class <?> cl = Customer.class;
		Constructor <?>[] cr= cl.getConstructors();
		for(Constructor <?> c :cr) {
			System.out.println(c);
		}
		Constructor <?> cs =cl.getDeclaredConstructor(String.class, String.class, int.class);
		
		cs.setAccessible(true);
		
		Customer cos =(Customer) cs.newInstance("Rahul","Smart Watch",1200);
		
		System.out.println(cos);
		
	    Field  fd =cl.getDeclaredField("name");
		Field fd2 =cl.getDeclaredField("item");
		Field fd3 = cl.getDeclaredField("price");
		
		Method [] meth =cl.getDeclaredMethods();
		Method meth2 =cl.getDeclaredMethod("ShowDetails");
		fd.setAccessible(true);
		fd2.setAccessible(true);
		fd3.setAccessible(true);
		
		meth2.setAccessible(true);
	    meth2.invoke(meth2, cos);
		System.out.println(fd.get(cos));
		System.out.println(fd2.get(cos));
		System.out.println(fd3.get(cos));
		
	}

}
class Customer {
	private String name;
	
	private String item;
	
	private int price;
	
	private Customer (String name, String item, int price) {
		this.item=item;
		this.name=name;
		this.price=price;
	}
	
	private void ShowDetails() {
		System.out.println("Customer Name : "+name);
		System.out.println("Orderd Item : "+item);
		System.out.println("Orice  : "+price);
	}
	
//	public String toString() {
//		return name+" "+item+" "+price;
//		
//	}
}
