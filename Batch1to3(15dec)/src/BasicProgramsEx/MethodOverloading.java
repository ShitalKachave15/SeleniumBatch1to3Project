package BasicProgramsEx;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 add(10);
 add(10,20);
 add(10.45f,20);
 add("asfhnjsa");
	}
  
	public static void add(int a)
	{
		System.out.println(a);
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(float a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(String fname)
	{
		System.out.println(fname);
	}
}
