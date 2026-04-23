package ClassndObject1;

public class Variabletype {
	
static	int staticvar=34;   
String fname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variabletype obj=new Variabletype();
		obj.add();
		System.out.println(staticvar);
		String data=obj.fname="abc";
		System.out.println(data);
		System.out.println(obj.fname="xyz");
	}
	
	
	public void add()
	{
		int a=10;
		System.out.println(a);
	}
	
}
