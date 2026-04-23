package ClassandObject;

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx  obj=new ConstructorEx();   //constructor call
		obj.method("abc");    //method call
		obj.method("xyz");
		
		ConstructorEx  obj1=new ConstructorEx(5);   //constructor call
		ConstructorEx  obj2=new ConstructorEx("Last name");   //constructor call
	}
	
	
	//method
	public void method(String fname)
	{
		System.out.println(fname);
	}
	
	
	//constructor
	public  ConstructorEx()
	{
		int a=10;
		System.out.println(a);
	}

	
	public ConstructorEx(int b)
	{
		System.out.println(b);
	}
	
	public ConstructorEx(String lname)  {
		System.out.println(lname);
	}
}
