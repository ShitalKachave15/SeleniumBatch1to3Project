package ClassndObject1;

public class StudentEx {
	
	
	int rollno;    //instance var
	String name;
	static String clgname="thane";   //static var

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEx obj=new StudentEx();
		obj.studentdetials(1, "abc");
		obj.display();
		obj.studentdetials(2, "xyz");
		obj.display();
		obj.studentdetials(3, "pqr");
		obj.display();
		
		StudentEx obj1=new StudentEx();
		obj1.studentdetials(4, "xyz");
		obj1.display();
	}

	
//	 public void studentdetials(int r,String n) {
//		 rollno=r;
//		 name=n;
//	 }
	
	public void studentdetials(int rollno,String name) {
		 this.rollno=rollno;
		 this.name=name;
	 }
	 
	 
	 public void display()
	 {
		 System.out.println("roll no is "+rollno);
		 System.out.println("name  is "+name);
		 System.out.println("clg name is "+clgname);
	 }
}
