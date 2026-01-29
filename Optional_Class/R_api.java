package Optional_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class R_api {
	public static void main (String [] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	System.out.println(Student.class);
		
	Class <?> cl = Class.forName("Optional_Class.Student");
	
	          Constructor<?>[]cs =cl.getDeclaredConstructors();
	          System.out.println(cs.length);
	          
	          
	          
	          for(Constructor<?> c : cs) {
	        	  System.out.println(c);
	        	  
	          }
	      
	          Constructor<?> cl2= cl.getDeclaredConstructor(String.class);
	          cl2.setAccessible(true);
	          
	        Student st=  (Student) cl2.newInstance("nanda");
	        System.out.println(st.s1);
	          
	          
		}

}
class Student {
	String s1;
	
	public Student() {
		
	}
	Student(int a) {
		
	}
	private Student (String s1){
		this.s1=s1;
		
	}

}
