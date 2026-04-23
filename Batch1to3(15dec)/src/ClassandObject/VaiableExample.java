package ClassandObject;

public class VaiableExample {

	
	 int id;
	 String fname;
	 static String clgname="thane";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaiableExample obj=new VaiableExample();
		
     obj.SData(1,"ahgds");
     obj.display();
     
     VaiableExample obj1=new VaiableExample();
     obj1.SData(2,"new");
     obj1.display();
	}
	
	public void SData(int r,String name)
	{
		id=r;
		fname=name;
	}
	
	public void display()
	{
		System.out.println("id is"+id);
		System.out.println("name is"+fname);
		System.out.println("clg name"+clgname);
	}

}
