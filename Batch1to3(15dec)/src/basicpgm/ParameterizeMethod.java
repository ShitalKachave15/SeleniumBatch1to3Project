package basicpgm;

public class ParameterizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  add(110,20);
  fname("abc");
  add(10,30);
  fname("xyz");
  add(20,20);
  fname("pqr");
	}

	
	
	public static void add(int a,int b)
	{
		int resu=a+b;
		System.out.println(resu);
	}
	
	public static void fname(String name)
	{
		System.out.println(name);
	}
}
