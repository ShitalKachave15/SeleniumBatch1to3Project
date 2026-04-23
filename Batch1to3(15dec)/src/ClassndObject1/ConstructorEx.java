package ClassndObject1;

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorEx obj=new ConstructorEx();
		obj.sample();
		ConstructorEx obj1=new ConstructorEx(4);
		ConstructorEx obj2=new ConstructorEx("abc");
		
	}

	
	 public void sample()
	 {
		 System.out.println("sample method");
	 }
	 
	 public  ConstructorEx()
	 {
		 System.out.println("constructor");
	 }
	 
	 public  ConstructorEx(int a)
	 {
		 System.out.println("constructor"+a);
	 }
	 
	 public  ConstructorEx(String fname)
	 {
		 System.out.println("constructor"+fname);
	 }
}
