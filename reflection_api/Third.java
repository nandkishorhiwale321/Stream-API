package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;
import java.lang.reflect.InvocationTargetException;


public class Third {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class<?> cl = Class.forName("reflection_api.Actor");
		Constructor<?>[] cs= cl.getDeclaredConstructors();
		Constructor<?> cs2=cl.getDeclaredConstructor(double.class);
		Constructor<?> cs3=cl.getDeclaredConstructor(String.class);
		Constructor<?>cs4=cl.getDeclaredConstructor(int.class);
		
		cs2.setAccessible(true);
		cs3.setAccessible(true);
		cs4.setAccessible(true);
		 
		Actor act =(Actor)cs2.newInstance(5556565.02);
		System.out.println();
		Actor act2 =(Actor)cs3.newInstance("harry");
		Actor act3 = (Actor)cs4.newInstance(1201);
		
		Field [] fields= cl.getDeclaredFields();
		
		for(Field f: fields)
		{
			System.out.println(f);
			
		}
		
		Field f=cl.getDeclaredField("salary");
		f.setAccessible(true);
		
	//	f.setDouble(act, 1000000.30);
		System.out.println(f.getDouble(act));
		

		Field f2=cl.getDeclaredField("name");
		f2.setAccessible(true);
	//	f2.set(act2, "john");
		System.out.println(f2.get(act2));
		
		Field f3 =cl.getDeclaredField("id");
		f3.setAccessible(true);
		//f3.setInt(act3, 101);
		System.out.println(f3.getInt(act3));
	}

}
class Actor {
	private double salary;
	private String name;
	private int id;
	
	private Actor(double salary) {
		this.salary=salary;
	}
	private Actor(String name) {
		this.name=name;
	}
	private Actor (int id) {
		this.id=id;
	}
}
