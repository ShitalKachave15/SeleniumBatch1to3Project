package basicpgm;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> cars = new ArrayList<String>();
		 cars.add("abc");
		 cars.add("xyz");
		 System.out.println(cars);
		 cars.add(0,"newdata");
		 System.out.println(cars);
		 cars.add(2,"data");
		 cars.set(2, "updated");
		 System.out.println(cars.get(2));
	}

}
