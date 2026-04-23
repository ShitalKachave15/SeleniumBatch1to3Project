package ClassndObject1;

public class StudentConstructor {

	
	 int roll;
	 String fname;
	 static String clgname="thane";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentConstructor obj=new StudentConstructor(1,"abc");
		obj.display();
		StudentConstructor stud1=new StudentConstructor(2,"pqr");
		stud1.display();
	}
	
	public StudentConstructor(int r,String n)
	{
		roll=r;
		fname=n;
	}
	 
	 public void display()
	 {
		 System.out.println("roll no is "+roll);
		 System.out.println("name  is "+fname);
		 System.out.println("clg name is "+clgname);
	 }

}
