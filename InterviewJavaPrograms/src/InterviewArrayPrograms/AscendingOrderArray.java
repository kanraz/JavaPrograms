package InterviewArrayPrograms;

import java.util.Scanner;

public class AscendingOrderArray {

	public static void main(String[] args) {
		int b;
		Scanner sc= new Scanner(System.in);
		System.out.println("how many numbers u wanna enter in the array");
		int n=sc.nextInt();
		 int a[] = new int[n];
		
		 System.out.println("Please enter "+n+" numbers of an array");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 sc.close();
		 for(int i=0;i<n;i++)
		 {
			 for(int j=i+1;j<n;j++)
			 {
				 if(a[i]>a[j]) {
					 b = a[i];
					 a[i]= a[j] ;
					 a[j]=b;
					 
				 }		
				
			 }
			 
		 }
		 System.out.println("array in assending order");
		 for (int i = 0; i < n ; i++) 
	        {
	            //System.out.print(a[i] + "  ");
			 System.out.println(a[i]);
	        }
	       // System.out.print(a[n - 1]);
	}

}
