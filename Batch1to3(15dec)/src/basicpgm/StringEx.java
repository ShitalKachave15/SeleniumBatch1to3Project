package basicpgm;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="This J Is Java programming  lang Java      ";
   System.out.println(str);
   
   int len=str.length();
   System.out.println(len);
   //find out how many occurance/letter is stored in string 
   System.out.println(str.length());  //start from 1number
   System.out.println(str.toLowerCase());
   System.out.println(str.toUpperCase());
   
   System.out.println(str.indexOf("Java"));  //start from 0 number
   System.out.println(str.indexOf("J")); 
   System.out.println(str.lastIndexOf("Java")); 
   System.out.println(str.startsWith("A"));
   System.out.println(str.startsWith("T"));
   System.out.println(str.endsWith("A"));
   System.out.println(str.endsWith("a"));
   
   System.out.println(str.trim());
   System.out.println("before trim  ["+str+"]");
   System.out.println("After trim  ["+str.trim()+"]");
   System.out.println(str.charAt(17));
   
   
   String txt1 = "Hello";
   String txt2 = "hello";

   String txt3 = "Greetings";
   String txt4 = "Great things";
   
   System.out.println(txt1.equals(txt2));
   System.out.println(txt1.equalsIgnoreCase(txt2));
   System.out.println(txt3.equals(txt4));
   
   System.out.println(txt1+txt2);
   System.out.println(txt1.concat(txt4));
   
   String name="abc";
   String lname="xyz";
   int id=1;
   
   System.out.println(" my name is "+name+" my last name is "+lname+" my id is "+id);
   
   
   
   
   String special="this it\"s is \n a \"java\" lang";
   System.out.println(special);
   System.out.println(str.substring(10,15));
   
   
	}

}
