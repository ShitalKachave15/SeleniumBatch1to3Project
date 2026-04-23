package AbstractionEx;

public class MainAbsClass extends FirstAbstract{
	
	public void mainmethod()
	{
		System.out.println("main method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainAbsClass obj=new MainAbsClass();
		obj.add();
		obj.sub();
		obj.mainmethod();
	}

	@Override
	public  void sub() {
		// TODO Auto-generated method stub
		 int a,b,c;
		 a=10;
		 b=20;
		 c=a-b;
		 System.out.println("sub"+c);
	}

}
