package BasicProgramsEx;

public class LoopingSTMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//while
//		variable,condition,inc/dec
		
		int a=0;
		while(a<10)//true
		{
			System.out.println(a);
			a++;
			
		}
		System.out.println("hello");
		a=10;
		while(a>0)//true
		{
			
			System.out.println(a);
			--a;
			
		}
		a=10;
		while(a>20)//false
		{
			
			System.out.println(a);
			--a;
			
		}
		System.out.println("hello");
		a=0;
		while(a<10)//true
		{
			
			System.out.println(a);
//			--a;
//	       a=a+2;
			a+=2;
			
			
		}
		System.out.println("hello");
		
		a=0;
		while(a<50)
		{
			if(a==10)
			{
				break;
			}
			System.out.println(a);
			a++;
			
		}
		
		
		
		//do while
		a=0;
		do {
			System.out.println(a);
			a++;
		}while(a<5);
		
		
		a=10;
		do {
			System.out.println(a);
			--a;
		}while(a<0);
		
		
		a=0;
		do {
			System.out.println(a);
			a++;
		}while(a>5);
		
		//for
//		for(init;condition;inc/dec)
//		{
//			stmt;
//			
//		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
		
		//nested
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(i+" "+j);
			}
		}
		
	}

}
