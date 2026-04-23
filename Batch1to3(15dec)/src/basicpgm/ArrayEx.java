package basicpgm;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ary[]= {1,2,3,4,5,6};
		System.out.println(ary[5]);
		ary[2]=30;
		
		System.out.println(ary[2]);
		System.out.println(ary.length);
		
		 String[] arr=new String[3];
		 
		 arr[0]="bmw";
		 arr[1]="bmw1";
		 arr[2]="bmw2";
		
		 System.out.println(ary[1]);
		 System.out.println(ary[0]);
		 System.out.println(ary[2]);
		 
		 
		 
		 for(int i=0;i<ary.length;i++)
		 {
			 System.out.println(ary[i]);
		 }
		 
		 
		 //for each
//		 syntax
//		 
//		 for(datatype newvarname:oldaarayname)
//		 {
//			 System.out.println(newvarname);
//		 }
		 
		 for(String newarr:arr)
		 {
			 System.out.println(newarr);
		 }
		 
		 
		 int[][] mularr= {
				 {1,2,3},
				 {4,5,6},
				 {7,8,9}
		 };
		 
		 
		 System.out.println(mularr[1][1]);
		 
		 for(int i=0;i<mularr.length;i++)
		 {
			 for(int j=0;j<mularr.length;j++)
			 {
				 System.out.println(mularr[i][j]);
			 }
		 }
	}

}
