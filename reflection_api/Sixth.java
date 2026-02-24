package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Sixth {

	public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
		System.out.println(Animal.class);
		
		Class<?>cl = Animal.class;
		
		Constructor <?>[] cs=cl.getDeclaredConstructors();
		Constructor<?> cs2=cl.getDeclaredConstructor(String.class);
		cs2.setAccessible(true);
		
		Animal ani = (Animal) cs2.newInstance("nandkumar");
		Field [] fd = cl.getDeclaredFields();	
		
		for(Field f:fd) {
			System.out.println(f);
		}
		
		
		Field fd1 = cl.getDeclaredField("name");
		fd1.setAccessible(true);
		
		   fd1.set(fd1, "ram");
		System.out.println(fd1.get(ani));
		System.out.println(fd1.get(fd1));
//		Animal.name = "John";
//		System.out.println(ani);
//	    
		
		
		

	}

}
class Animal{
	
	public static  String name;
	
	public Animal(String name) {
		this.name=name;
	}
}
