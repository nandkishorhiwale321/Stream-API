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
		 
		 
		 
		 
		 Method[] m = cl.getDeclaredMethods();
		 for(Method me:m) {
			 System.out.println(me);
		 }
		 Method m1=cl.getDeclaredMethod("getname", String.class);
		 m1.setAccessible(true);
		 Object res =m1.invoke(s,"yuvraj");
		 System.out.println(res);
		
	}

}
class Student {
	
	private String name;
	
	private Student(String name) {
		this.name=name;
	}
	private String getname(String name) {
		return this.name=name;
	}
}
