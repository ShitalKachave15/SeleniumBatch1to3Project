package BasicProgramsEx;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		add();
		
		 System.out.println("hello");
			add();
			System.out.println("hello");
			add();
			System.out.println("hello");
			add();
			add1(30,40);
			add1(60,40);
			add1(80,40);
			name("abc");
			System.out.println(sub(4,7));
			System.out.println(lname("aidsjfi"));
	}

	
	  public static void add()
	  {
		  int a=10;
			 int b=20;
			 int c=a+b;
			 System.out.println("addition is"+c);
			
	  }
	  
	  
	  public static void add1(int x,int y)
	  {
		  int add=x+y;
		  System.out.println(add);
	  }
	  
	  public static void name(String fname)
	  {
		  
		  System.out.println(fname);
	  }
	  
	  public static int sub(int a,int b)
	  {
		  int c=a-b;
		 return c;
	  }
	  
	  public static String lname(String lastname)
	  {
		  return lastname;
	  }
	  
	  
	 
}
