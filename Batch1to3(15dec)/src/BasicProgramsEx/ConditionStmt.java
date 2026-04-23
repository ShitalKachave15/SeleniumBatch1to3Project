package BasicProgramsEx;

public class ConditionStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  syntax
//		if(condition)
//		{
//			stmt;
//			
//		}
		
		int a=10;
		if(a<15)   //true
		{
			System.out.println("a is less");
		}
		
		if(a<5)     //false
		{
			System.out.println("a is greater");
		}
		
		
		//if-else
//		syntax
//		if(condition)
//		{
//			stmt;
//			
//		}
//		else
//		{
//			stmt;
//		}
		
		if(a<15)   //true
		{
			System.out.println("a is less");
		}
		else
		{
			System.out.println("a is greater");
		}
		
		if(a<5)     //false
		{
			System.out.println("a is less");
		}
		else
		{
			System.out.println(" a is greater");
		}
		
		//assi
//		  even/odd
//		  positive /negative no
		//adult and child
		//morning and night
		
		
		//if-else if ladder
		
//		syntax
//		if(condition)
//		{
//			stmt;
//		}
//		else if(condition)
//		{
//			stmt;
//		}
//		else
//		{
//			stmt;
//		}
		a=10;
		if(a>5) //true
		{
			System.out.println("a is greater");
		}
		else if(a<5)
		{
			System.out.println("a is less");
		}
		else
		{
			System.out.println("a is equal");
		}
		
		a=1;
		if(a>5) //false
		{
			System.out.println("a is greater");
		}
		else if(a<5)  //true
		{
			System.out.println("a is less");
		}
		else
		{
			System.out.println("a is equal");
		}
		
		a=5;
		if(a>5) //false
		{
			System.out.println("a is greater");
		}
		else if(a<5) //false
		{
			System.out.println("a is less");
		}
		else   //true
		{
			System.out.println("a is equal");
		}
		
		a=5;
		if(a>=5) //true
		{
			System.out.println("a is greater");
		}
		else if(a<5) //false
		{
			System.out.println("a is less");
		}
		else   //true
		{
			System.out.println("a is equal");
		}
		
		//logical operator
		
		a=10;
		if(a>5 && a<11) // true
		{
			System.out.println("a is graeter");
		}
		else if(a<15 && a>8)
		{
			System.out.println(" a  is less");
		}
		else
		{
			System.out.println(" equal");
		}
		
		a=10;
		if(a>15 && a<15) // false
		{
			System.out.println("a is graeter");
		}
		else if(a<15 && a>8) //true
		{
			System.out.println(" a  is less");
		}
		
		else
		{
			System.out.println(" equal");
		}
		
		
		a=10;
		if(a>15 || a<15) // true (at least one condition is true
		{
			System.out.println("a is graeter");
		}
		else if(a<15 && a>8) //true
		{
			System.out.println(" a  is less");
		}
		else
		{
			System.out.println(" equal");
		}
		
		
		//good morning,afternoon,evening,night
		//child ,adult, old
		// marks-grade a,b,c,d
		
		
		//nested
//		if(condition)
//		{
//			if(condition)
//			{
//				stmt;
//			}
//		}
		
		a=10;
		if(a>5)  //true
		{
			System.out.println("a is big");
			if(a<15) //true
			{
				System.out.println("a is small");
			}
		}
		
		a=10;
		if(a>15)  //false
		{
			System.out.println("a is big");
			if(a<15) //true
			{
				System.out.println("a is small");
			}
		}
		
		a=10;
		if(a>5)  //true
		{
			System.out.println("a is big");
			if(a<5) //false
			{
				System.out.println("a is small");
			}
		}
		
		
		
		//nested
//		if(condition)
//		{
//			if(condition)
//			{
//				stmt;
//			}
//		else
//		{
//			stmt;
//		}
//		}
		
		a=10;
		if(a>5)  //true
		{
			System.out.println("a is big");
			if(a<5) //false
			{
				System.out.println("a is small");
			}
			else  //true
			{
				System.out.println("a is big");
			}
		}
		
		
		
		//if(condition)
//			{
//				if(condition)
//				{
//					stmt;
//				}
//			else
//			{
//				stmt;
//			}
//			}
		
//		else
//		{
//			stmt
//			if(condition)
//			{
//				stmt;
//			}
//		}
		
		
		a=10;
		if(a>15)  //false
		{
			System.out.println("a is big");
			if(a<15) //true
			{
				System.out.println("a is small");
			}
		}
		else
		{
			System.out.println("a is small");
			if(a<15)//true
			{
				 System.out.println(" a is greater");
			}
		}
		
		a=10;
		if(a>15)  //false
		{
			System.out.println("a is big");
			if(a<15) //true
			{
				System.out.println("a is small");
			}
		}
		else
		{
			System.out.println("a is small");
			if(a<5)//false
			{
				 System.out.println(" a is greater");
			}
			else
			{
				 System.out.println(" a is less");
			}
		}
		
		
		
		//switch
		
//		switch(expression)
//		{
//		case :
//			stmt;
//			break;
//		case :
//			stmt;
//			break;
//		case :
//			stmt;
//			break;
//		case :
//			stmt;
//			break;
//			default:
//				stmt;
//		}
		
		
		int no=5;
		switch(no)
		{
		case 1:
			System.out.println(" no is 1");
			break;
		case 2:
			System.out.println(" no is 2");
			break;
		case 3:
			System.out.println(" no is 3");
			break;
		case 4:
			System.out.println(" no is 4");
			break;
		case 5:
			System.out.println(" no is 5");
			break;
		}
		
		no=3;
		switch(no)
		{
		case 1:
			System.out.println(" no is 1");
		
		case 2:
			System.out.println(" no is 2");
			
		case 3:
			System.out.println(" no is 3");
		
		case 4:
			System.out.println(" no is 4");
			
		case 5:
			System.out.println(" no is 5");
			
		}
		 char ch='a';
		switch(ch)
		{
		case 'v':
			System.out.println(" no is 1");
			break;
		case 'w':
			System.out.println(" no is 2");
			break;
		case 'a':
			System.out.println(" A");
			break;
		case 'h':
			System.out.println(" no is 4");
			break;
		case 'b':
			System.out.println(" no is 5");
			break;
		}
		
		//ass
//		weekdays -today day
		//month
		//calculator -add,sub,mul,div
		//course
		//vowel
		
	}
	
	

}

