package basicpgm;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//arithmetic operator
		
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
		int sub=a-b;
		System.out.println(sub);

		int mul=a*b;
		System.out.println(mul);
		

		int div=a/b;
		System.out.println(div);
		

		int mod=a%b; //reminder
		System.out.println(mod);
		
           a=10;
           System.out.println(++a);
           b=20;
           System.out.println(--b);
           
           
           //assignment
//           int c=a+b;
//           a=a+b;
           
           System.out.println(a+=b);
           
//           a=a-b;
           System.out.println(a-=b);
           
//           a=a*b;
           System.out.println(a*=b);
           
//           a=a/b;
           System.out.println(a/=b);
           
           //comparison 
             
           boolean result=a>b;
           System.out.println(result);
            
           result=a<b;
           System.out.println(result);
           
           result=a==b;
           System.out.println(result);
           
           result=a!=b;
           System.out.println(result);
           
           result=a>=b;
           System.out.println(result);
           result=a<=b;
           System.out.println(result);
           
	}

}
