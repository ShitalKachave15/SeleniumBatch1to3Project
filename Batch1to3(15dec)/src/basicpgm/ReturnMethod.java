package basicpgm;

public class ReturnMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(10,20);
   System.out.println( add(10,20));
   System.out.println(details("abc"));
	}
	
	 public static int add(int a,int b)
	 {
		 return a+b;
		 
	 }
	 
	 public static String details(String fname)
	 {
		  return fname;
	 }

}
