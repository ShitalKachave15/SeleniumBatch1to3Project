package InheritanceEx;

public class ChildClassInher extends FirstClassInher {
	
	public void childmethod()
	{
		System.out.println("child method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassInher obj=new ChildClassInher();
	
		obj.childmethod();
		obj.parentmethod();
		System.out.println(obj.roll);
	}

}
