package BasicProgramsEx;

public class Sample {
	
	public static void main(String[] args)
	{
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		System.out.println("hello world");
		
		//Variables nd datatype
//		syntax of variable
//		datatype varaiablename;
		
		boolean bool;
		bool=true;    //initalization
		System.out.println(bool);
		
		char ch='a';
		System.out.println(ch);
		
		byte b=127;
	short sh=32624;
	
	int i=234243243;
	long l=43543534546l;
	System.out.println(l);
	
	float f=34.656546f;
	System.out.println(f);
	
	double d=343.4565756866d;
	System.out.println(d);
	
	String str="abcdjfjjssc";
	System.out.println(str);
	
	
	//print the varible
	int a=10;
	int bb=20;
	int c=a+bb;
	System.out.println("addition is"+c);
	
	String str1="abc";
	String str2="xyz";
	System.out.println(str1+str2);
	
	String no1="10";
	String no2="20";
	String res=no1+no2;
	System.out.println(res);
	
	//type casting
	
	int num=10;
	System.out.println(num);
	float num1=num;
	System.out.println(num1);
	
	
	float num2=34.7657f;
	System.out.println(num2);
	int num3=(int)num2;
	System.out.println(num3);
	
	//operator
	
//	arithmetic opr
	
	int n1=2;
	int n2=3;
	int ans=n1+n2;
	System.out.println(ans);
	ans=n1-n2;
	System.out.println(ans);
	ans=n1*n2;
	System.out.println(ans);
	ans=n1/n2;
	System.out.println(ans);
	ans=n1%n2;
	System.out.println(ans);
	
	System.out.println(++n1);
	System.out.println(--n2);
	
	//assignment =.+=,-+,*=,/=
	
	int data=10;
	int data2=20;
	
	data=data+data2;
	System.out.println(data);
	
	data+=data2;
	System.out.println(data);
	data-=data2;
	System.out.println(data);
	data*=data2;
	System.out.println(data);
	data/=data2;
	System.out.println(data);
	data%=data2;
	System.out.println(data);
	
	// comparision operator
	 int aa=10;
	 int cc=20;
	 boolean test=aa==cc;
	 System.out.println(test);
	 test=aa>cc;
	 System.out.println(test);
	 test=aa!=cc;
	 System.out.println(test);
	 test=aa<cc;
	 System.out.println(test);
	 test=aa<=cc;
	 System.out.println(test);
	 test=aa>=cc;
	 System.out.println(test);
	 
	 //String
	 
	 String st="  This j Is java lang     ";
	 String st1="this is object base lang";
	 String st2="this j Is java lang";
	 System.out.println(st);
	 
	 System.out.println(st.length());
	 System.out.println(st.toLowerCase());
	 System.out.println(st.toUpperCase());
	 System.out.println(st.indexOf('j'));  //count start from 0
	 System.out.println(st.indexOf('J'));
	 System.out.println(st.indexOf("java"));
	 System.out.println(st.charAt(2));
	 System.out.println(st.equals(st1));
	 System.out.println(st.equals(st2));
	 System.out.println(st.equalsIgnoreCase(st2));
	 System.out.println("trim ["+st+"]");
	 System.out.println("trim ["+st.trim()+"]");
	 System.out.println(st1.startsWith("t"));
	 System.out.println(st1.endsWith("a"));
	 System.out.println(st.substring(8));
	 System.out.println(st.substring(11,16));
	 
	 
	 System.out.println(st.concat(st1));
	 
	 st="This j Is \"java\" lang";
	 
	 st="This j Is \n \"java\" lang";
	 st=" \t This j Is \"java\" lang";
	 st="This j \\Is \"java\" lang";
	 System.out.println(st);
	 
	}

}



