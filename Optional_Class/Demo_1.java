package Optional_Class;

import java.util.HashMap;
import java.util.Map;

public class Demo_1 {

	public static void main(String[] args) {
		
int a=153;		
int f=0;
 
for(int i=0;i<4;i++) {
	
	int di= a%10;
	int mul= di*di*di;
        f=f+mul;
         a=a/10;
}
		
		System.out.println(f);
	}
}

	

		