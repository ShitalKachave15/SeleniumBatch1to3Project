package basicpgm;

public class Loopinstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//while
//		while(condition)
//		{
//			stmt;
//			inc/dec;
//		}
		
		int i=0;
		while(i<10)  //true
		{
			System.out.println(i);
			i++;
		}
		
		
		i=0;
		while(i>10)  //false
		{
			System.out.println(i);
			i++;
		}
		
		
		i=10;
		while(i>0)  //true
		{
			System.out.println(i);
			--i;
		}
		

		i=10;
		while(i>0)  //true
		{
			System.out.println(i);
//			--i;
//			i=i-1;
			i-=2;
			
			
		}
		
		
		i=0;
		while(i<50)
		{
			if(i==10)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		
		
		
		//do while
//		
//		do {
//			stmt;
//			inc/dec;
//			
//		}while(condition);
		
		
		
		int no=0;
		do {
			System.out.println(no);
			no++;
			
		}while(i<10);
		
		

		 no=10;
		do {
			System.out.println(no);
			no++;
			
		}while(i<10);
		
		

		 no=10;
		 
		do {
			System.out.println(no);
			--no;
			
		}while(no>0);
		
		 no=50;
		 
			do {
				if(no==10)
				{
					break;
				}
				System.out.println(no);
				--no;
				
			}while(no>0);
			
			
			//for
//			for(init;condition;inc/dec)
//			{
//				stsmt;
//			}
			
			
			for(int j=0;j<10;j++)
			{
				System.out.println(j);
			}
			

			for(int j=10;j>0;j--)
			{
				System.out.println(j);
			}
			
			
			//nested for loop
			
			for( i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(i+"  "+j);
				}
			}
			
			
			
	}
	

}
