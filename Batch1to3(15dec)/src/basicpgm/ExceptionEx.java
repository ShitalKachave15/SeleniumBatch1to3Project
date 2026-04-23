package basicpgm;

public class ExceptionEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//     int[] arr= {1,2,3,4};
//     System.out.println(arr[7]);
//		
//		try {
//			 int[] arr= {1,2,3,4};
//		     System.out.println(arr[7]);
//		}
//		catch(Exception e)
//		{
//			System.out.println("array value something wrong");
//		}
     System.out.println("hello");
     try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println("hello");
     try {
 		Thread.sleep(2000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
     System.out.println("hello");
     try {
 		Thread.sleep(2000);
 	} catch (InterruptedException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
     System.out.println("hello");
     
     
		Thread.sleep(3000);
		
		System.out.println("hello");
		checkAge(10);	     
	}

	
	
	static void checkAge(int age) {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

}
