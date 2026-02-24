package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Five {
	public static void main (String [] args) throws Exception {
		
		Class<?> as = Class.forName("reflection_api.Sir"); 	
		
		Constructor <?> [] cr=as.getDeclaredConstructors();
		
		for(Constructor c:cr) {
			System.out.println(c);
		}
		
		Constructor<?>cr2=as.getDeclaredConstructor(String.class,int.class);
		cr2.setAccessible(true);
		Sir sir =(Sir)cr2.newInstance("ram",101);
		
		Field [] field =as.getDeclaredFields();
		for(Field f:field) {
			System.out.println(f);
		}
		
		Field field2 = as.getDeclaredField("name");
		field2.setAccessible(true);
		System.out.println(field2.get(sir));
		
		Field field3 =as.getDeclaredField("id");
		field3.setAccessible(true);
		System.out.println(field3.get(sir));
		
		}

}
class Sir {
	
	public static String name;
	
	private static int id;
	
	private Sir(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
}
