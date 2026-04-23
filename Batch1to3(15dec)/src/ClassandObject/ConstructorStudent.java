package ClassandObject;

public class ConstructorStudent {
	
	int id;
	String name;
	static String clgname="thane";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorStudent stud1=new ConstructorStudent(1,"abc");
		stud1.display();
		
		ConstructorStudent stud2=new ConstructorStudent(2,"xyz");
		stud2.display();
	}

	
	  public ConstructorStudent(int id,String name)
	  {
		  this.id=id;
		  this.name=name;
	  }
	  
	  public void display()
	  {
		  System.out.println("id is"+id);
			System.out.println("name is"+name);
			System.out.println("clg name"+clgname);
	  }
}
