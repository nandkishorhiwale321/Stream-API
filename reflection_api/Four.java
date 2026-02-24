package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Four {
	public static void main(String [] args) throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		System.out.println(Room.class);
		
		Class<?> cl=Class.forName("reflection_api.Room");
	
		Constructor<?> [] cs=cl.getDeclaredConstructors();
		Constructor<?> cs2= cl.getDeclaredConstructor(String.class);

		
		cs2.setAccessible(true);
		Room r=(Room) cs2.newInstance("Yuvi holls");
		
		
		Field field [] =cl.getDeclaredFields();
		
		for(Field f :field) {
			System.out.println(f);
			
		}
		Field f2=cl.getDeclaredField("name");
		f2.setAccessible(true);
		System.out.println(f2.get(r));
		
		
		
//		Method [] m =cl.getMethods();
//		
//		for(Method m1:m) {
//			System.out.println(m);
//		}
//		
		
		
		
	}

}
class Room{
	private String name;
	
	private Room(String name) {
		this.name=name;
	}
//	private String getname(String name) {
//		return this.name=name;
//	}
}
