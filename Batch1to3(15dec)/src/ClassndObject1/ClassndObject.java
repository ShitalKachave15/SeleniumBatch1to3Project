package ClassndObject1;

public class ClassndObject {

	static  int a=10;
	int b=20;    //attributes
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassndObject obj=new ClassndObject();
		ClassndObject obj1=new ClassndObject();
		ClassndObject obj2=new ClassndObject();
     System.out.println(obj.b);
     staticmethod();
     obj.classmethod();
     obj1.classmethod();
     obj2.classmethod();
	}
	
	 
  public static void staticmethod()

{
	  System.out.println("Statci method");
	}
  
  
  public void classmethod()
  {
	  System.out.println("Class method");
  }
}
