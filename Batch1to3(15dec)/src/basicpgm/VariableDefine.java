package basicpgm;

public class VariableDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int a=10;
		  System.out.println(a);
		  System.out.println("this is a value="+a);
		  
		  String fname="abc";
		  String lname="xyz";
		  System.out.println("first name is"+fname);
		  System.out.println("full name is "+fname+" "+lname);
		  
		  int no1=10;
		  int no2=20;
		  int c=no1+no2;
		  System.out.println("addition is "+c);
		  
		  String str1="abc";
		  String str2="xyz";
		  String res=str1+str2;
		  System.out.println("this is a string "+res);
		  
		  String first="10";
		  String last="20";
		  String sum=first+last;
		  System.out.println("what is ans "+sum);
		  
		  int num;
		  num=10;
		  num=20;//change
		  System.out.println(num);
		  
		final  int num1=30;
		//  num1=40; //error you cant change value
		  System.out.println(num1);
	}

}
