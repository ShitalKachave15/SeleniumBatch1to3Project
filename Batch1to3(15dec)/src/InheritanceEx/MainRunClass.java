package InheritanceEx;

public class MainRunClass extends TwoClass{
	public void AnimalMAin()

	{
		System.out.println("Main method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainRunClass obj=new MainRunClass();
		obj.AnimalMAin();
		obj.animalDog();
		obj.animalCat();
	}

}
