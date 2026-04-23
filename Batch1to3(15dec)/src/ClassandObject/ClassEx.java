package ClassandObject;

public class ClassEx {
 
	
	static int a=10; 
	int b=30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     int a=10;
		
//		syntax
//		Classname objname=new classname();
		ClassEx obj=new ClassEx();
		  System.out.println(a);
     System.out.println(obj.b);
     
     staticmethod();
     
      obj.classmethod();
     
	}

	
	public static void staticmethod()
	{
		System.out.println("Static method");
	}
	
	
	public void classmethod()
	{
		System.out.println("class method");
	}
}
