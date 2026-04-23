package basicpgm;

public class ConditionalStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if
//		syntax
//		variable
//		if(condition)
//		{
//			stmt;
//		}

		
		  int i=10;
		//true
		  if(i>5)   //if u r condition is true that time ur program enter inside if block
		  {
			  System.out.println("i greater than 5");
		  }
		  
		  //false
		  if(i<5)
		  {
			  System.out.println("i less than 5");
		  }
		  
		  
		  
		  //if-else
		  
//		  variable
//		  if(condition)
//		  {
//			  stmt;
//		  }
//		  else
//		  {
//			  stmt;
//		  }
		  
		  i=5;
		  if(i<14) //true
		  {
			  System.out.println("i is less than 14");
		  }
		  else
		  {
			  System.out.println("i is greater");
		  }
		  
		  
		  //false
		  i=5;
		  if(i<4) //false
		  {
			  System.out.println("i is less than 14");
		  }
		  else
		  {
			  System.out.println("i is greater");
		  }
		  
		  //ass
		  //find out even odd no  (no%2==0)
		  //find out positive and negative no  
		  //find out adult and child
		  //print morning and night
		  //eligible for vote or not
		  
		  
		  
		  
		  //if-else if
		  
//		  if(condition)
//		  {
//			  stmt;
//			  
//		  }
//		  else if(condition)
//		  {
//			  stmt;
//		  }
//		  else if(condition)
//		  {
//			  stmt;
//		  }
//		  else {
//			  stmt;
//		  }
		  
		 int a=10;
		 if(a>5)   //true
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
		  
		 a=5;
		 if(a>5)   //false
		 {
			System.out.println("a is greater"); 
		 }
		 else if(a<5) //false
		 {
			System.out.println("a is less"); 
		 }
		 else
		 {
			 System.out.println("a is equal");
		 }
		  
		 
		 a=10;
		 if(a>15)   //false
		 {
			System.out.println("a is greater"); 
		 }
		 else if(a>5)//true
		 {
			System.out.println("a is less"); 
		 }
		 else
		 {
			 System.out.println("a is equal");
		 }
			  
		 
		 //child,adult,old
		 //positive,negative,equal
		 
		 
		 int marks=70;
		 
		 
		 if(marks<35 && marks>0)
		 {
			 System.out.println("failed");
		 }
		 else if(marks<45 && marks>35)
		 {
			 System.out.println("D grade");
		 }
		 else if(marks<55 && marks>45)
		 {
			 System.out.println("D + grade");
		 }
		 else if(marks<65 && marks>55)
		 {
			 System.out.println("C grade");
		 }
		 
		 else if(marks<75 && marks>65)
		 {
			 System.out.println("C+ grade");
		 }
		 else if(marks<85 && marks>75)
		 {
			 System.out.println("B grade");
		 }
		 else if(marks<95 && marks>85)
		 {
			 System.out.println("A grade");
		 }
		 else if(marks<95 && marks>99)
		 {
			 System.out.println("A+ grade");
		 }
		 else
		 {
			 System.out.println("invalid");
		 }
		 
		 //child,adult,old
		//morning,afternoon,night
		 
		 
		 
		 //nested if 
		  i=5;
		  if(i>1)
		  {
			  System.out.println(" i is greater");
			  if(i==5)
			  {
				  System.out.println("i is equal  ");
			  }
		  }
		 
		  
		  i=5;
		  if(i>1)
		  {
			  System.out.println(" i is greater");
			  if(i<4)  //false
			  {
				  System.out.println("i is less  ");
			  }
			  else
			  {
				  System.out.println("i is graeter");
			  }
		  }
		  
		  i=5;
		  if(i>15)  //false
		  {
			  System.out.println(" i is greater");
			  if(i<4)  //false
			  {
				  System.out.println("i is less  ");
			  }
			  else
			  {
				  System.out.println("i is graeter");
			  }
		  }
		  else
		  {
			  System.out.println("i is less");
			  if(i==5)  //true
			  {
				  System.out.println("i is equal");
			  }
		  }
		 
		 
		  
		  i=5;
		  if(i>15)  //false
		  {
			  System.out.println(" i is greater");
			  if(i<4)  //false
			  {
				  System.out.println("i is less  ");
			  }
			  else
			  {
				  System.out.println("i is graeter");
			  }
		  }
		  else
		  {
			  System.out.println("i is less");
			  if(i<5)  //false
			  {
				  System.out.println("i is not less");
			  }
			  else
			  {
				  System.out.println("i is equal");
			  }
		  }
		  
		  
		  //if-else shorthand  ternary operator  ?
		  
//		  variable = (condition) ? expressionTrue :  expressionFalse;
		    i=10;
		    String res=(i>15) ?  "passed" :"failed";
		    System.out.println(res);
		 
		    
		    
		    //switch
		    
//		    switch(expression)
//		    {
//		    case :
//		    	stmt;
//		    break;
//		    case :
//		    	stmt;
//		    	
//		    	break;
//		    	default:
//		    		stmt;
//		    }
		    
		    
		    
		    int no=15;
		    
		    switch(no)
		    {
		    case 1:
		    	System.out.println("first");
		    	break;
		    case 2:
		    	System.out.println("second");
		    	break;
		    case 3:
		    	System.out.println("third");
		    	break;
		    case 4:
		    	System.out.println("fourt");
		    	break;
		    case 5:
		    	System.out.println("five");
		    	break;
		    default:
		    	System.out.println("invalid");
		    	
		    }
		    
		    
		    //without break
		    no=1;
		    switch(no)
		    {
		    case 1:
		    	System.out.println("first");
		    	
		    case 2:
		    	System.out.println("second");
		    	
		    case 3:
		    	System.out.println("third");
		    	
		    case 4:
		    	System.out.println("fourth");
		    	
		    case 5:
		    	System.out.println("five");
		    	
		    default:
		    	System.out.println("invalid");
		    	
		    }
		     char ch='f';
		    switch(ch)
		    {
		    case 'a':
		    	System.out.println("first");
		    	break;
		    case 'w':
		    	System.out.println("second");
		    	break;
		    case 'c':
		    	System.out.println("third");
		    	break;
		    case 'f':
		    	System.out.println("fourth");
		    	break;
		    case 'h':
		    	System.out.println("five");
		    	break;
		    default:
		    	System.out.println("invalid");
		    	
		    }
		    
		    
		    //ass
   //	      weekday
		    //month
		    //course
		    //vowel
		    //calculator
		    
		    
		    char op='*';
		    String oprator="sub";
		    int num1=10;
		    int num2=20;
		    int result;
		    
		    switch(op)
		    {
		    case '+':
		    	result=num1+num2;
		    	System.out.println(result);
		    	break;
		    case '-':
		    	result=num1-num2;
		    	System.out.println(result);
		    	break;
		    	
		    case '*':
		    	result=num1*num2;
		    	System.out.println(result);
		    	break;
		    	
		    case '/':
		    	result=num1/num2;
		    	System.out.println(result);
		    	break;
		    	
		    	default:
		    		System.out.println("invalid");
		    }
		    
		    
	}
	

}
