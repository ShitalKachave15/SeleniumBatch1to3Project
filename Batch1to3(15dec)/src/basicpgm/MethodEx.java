package basicpgm;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();     //call the method
		
		System.out.println("hello");
		add();  
		System.out.println("hello");
		add(); 
	}
	
	
	//default method
	public static void add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	
	
	

}
