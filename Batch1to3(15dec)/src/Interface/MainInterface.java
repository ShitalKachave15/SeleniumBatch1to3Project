package Interface;

public class MainInterface  implements FirstInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainInterface obj=new MainInterface();
		obj.simple();
		obj.abstractmethod();
	}

	@Override
	public void simple() {
		// TODO Auto-generated method stub
		  System.out.println("simple method");
	}

	@Override
	public void abstractmethod() {
		// TODO Auto-generated method stub
		 System.out.println("abstract method");
	}

}
