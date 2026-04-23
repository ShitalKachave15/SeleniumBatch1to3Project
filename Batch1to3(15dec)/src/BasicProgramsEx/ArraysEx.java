package BasicProgramsEx;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] num= {1,2,3,4,5,7,6};
 System.out.println(num[4]);
 System.out.println(num[2]);
 num[2]=10;
 System.out.println(num[2]);
 
 String[] arr= {"ABC","pqr","xyz"};
 System.out.println(arr[2]);
 
  System.out.println(arr.length);
  for(int i=0;i<arr.length;i++)
  {
	  System.out.println("String arr is "+arr[i]);
  }
 
  
  //for each
//  for( datatype newvarname:oldarayname)
//  {
//	  System.out.println(newvarname);
//  }
  
  System.out.println("for e_ach");
  for( int i:num)
  {
	  System.out.println(i);
  }
  
  int[][] ary= {
		        {1,2,3},
		        {4,5,6}
  };
  
  System.out.println(ary[1][2]);
    
   float[] fl=new float[3];
   fl[0]=3.5f;
   fl[1]=3.5f;
   fl[2]=3.5f;
 
		 
   System.out.println(fl[1]);
	
   
   float[][] data=new float[2][2];
   data[0][0]=3.5f;
   data[0][1]=3.76f;
 
   data[1][0]=6.5545f;
   data[1][1]=543.553f;
		 
  
//   System.out.println(data[1][0]);
   System.out.println("Multi array");
   for(int i=0;i<data.length;i++)
   {
	   for(int j=0;j<data.length;j++)
	   {
		   System.out.println(data[i][j]);
	   }
   }
	}

}
