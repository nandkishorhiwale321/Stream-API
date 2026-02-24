package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Collectors;

public class Prac_01 {
	public static void main(String [] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		System.out.println(Demo.class);
		Class<?> cl =Demo.class;
		
		Constructor<?>[] cs =cl.getDeclaredConstructors();
		for(Constructor<?> c : cs) {
			System.out.println(c);
		}
	     Constructor <?> cs2 = cl.getDeclaredConstructor(String.class);
	     Constructor <?> cs3 = cl.getDeclaredConstructor(int.class);
	     cs2.setAccessible(true);
	     cs3.setAccessible(true);
	     
	     Demo d = (Demo) cs2.newInstance("Vedika");
	     
	     Field [] fd = cl.getDeclaredFields();
	     
	     for(Field f : fd) {
	    	 System.out.println(f);
	     }
		
	     Field fd1 = cl.getDeclaredField("name");
	     
	     fd1.setAccessible(true);
	     
	  //   fd1.set(d, "Vedika");
	    System.out.println(fd1.get(d));
		
		
		
	}

}
class Demo {
	private String name;
	
	private int Contact;
	
	private Demo(String name) {
		this.name=name;
	}
	
	private  Demo (int Contact) {
		this.Contact=Contact;
	}
}
