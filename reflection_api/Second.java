package reflection_api;

import java.lang.reflect.*;

public class Second {
	public static void main (String [] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> cl= Class.forName("reflection_api.Student");
		
		 Constructor<?>[] cs=cl.getDeclaredConstructors();
		 Constructor<?> cs2= cl.getDeclaredConstructor(String.class);
		 cs2.setAccessible(true);
		 Student s=(Student) cs2.newInstance("nandass");
		 
		 
		 Field [] fields = cl.getDeclaredFields();
		 
		 
		 for(Field f:fields) {
			 System.out.println(f);
		 }
		 
		 Field f=cl.getDeclaredField("name");
		 
		 f.setAccessible(true);
		 f.set(s, "nanda");
		 System.out.println(f.get(s));
		 
		 
		
	}

}
class Student {
	
	private String name;
	
	private Student(String name) {
		this.name=name;
	}
}
