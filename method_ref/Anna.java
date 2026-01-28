package method_ref;

public class Anna {
	public static void main (String [] args) {
		An aa =new An() {
			public int m(int s) {
				return s +10;
			}
			
		};
		System.out.println(aa.m(10));
		
	}

}
abstract class An {
	
            abstract int m(int s); 
	}
