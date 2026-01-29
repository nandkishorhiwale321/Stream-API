package reflection_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;



public class one {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
	 Class<?> cl=Class.forName("reflection_api.Bank");
	 
	 Constructor<?>[] cs=cl.getDeclaredConstructors();
	 
	 for(Constructor c: cs) {
		 System.out.println(c); 
	 }
		
	 Constructor<?> cl2= cl.getDeclaredConstructor(String.class,int.class);
//	 Constructor<?>c2=cl.getConstructor(String.class);
//	 c2.canAccess(true);
	 cl2.setAccessible(true);
	// Bank b1=(Bank)c2.newInstance("hello");
	 Bank b= (Bank)cl2.newInstance("heloo",98);
	 
	 System.out.println(b.name+":"+b.id);
	// System.out.println(b.id);
	}
    

}
class Bank {
	
	String name;
	double balnace;
	String ac;
	int id;
	public Bank() {
		
	}
	
	private Bank(double balnace) {
		this.balnace=balnace;
		
	}
	
	private Bank(String name,int id){
		this.name=name;
		this.id=id;
		
		
	}
	
}
