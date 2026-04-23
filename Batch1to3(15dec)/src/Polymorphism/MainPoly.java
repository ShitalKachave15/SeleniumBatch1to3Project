package Polymorphism;

public class MainPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Animal obj=new Animal();
           Animal cat=new Cat();
           Animal dog=new Dog();
           
           
           obj.animalSound();
           cat.animalSound();
           dog.animalSound();
	}

}
