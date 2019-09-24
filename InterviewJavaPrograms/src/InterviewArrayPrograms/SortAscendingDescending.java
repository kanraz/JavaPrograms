package InterviewArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class SortAscendingDescending {

	public static void main(String[] args) {
		int[] arr = {3,5,1,7,8,2,9,17,12,15};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		
		ascendingArray(arr);
		descendingArray(arr);
		System.out.println("*******************************************");
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1.add(4);
		arr1.add(7);
		arr1.add(5);
		arr1.add(12);
		arr1.add(3);
		arr1.add(2);
		System.out.println("**********ArrayList**********");
		System.out.println(arr1);
		System.out.println("**********ArrayListAscending**********");
		Collections.sort(arr1);
		System.out.println(arr1);
		System.out.println("**********ArrayListdescending**********");
		Collections.sort(arr1, Collections.reverseOrder());
		System.out.println(arr1);
		Iterator<Integer> it = arr1.iterator();
		
		while(it.hasNext())
		{
			int num = it.next();
			System.out.println(num);
		}
		

	}
	public static void ascendingArray(int[] a)
	{
		int num;
		for(int i=0;i<a.length;i++)
			
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					num =a[j];
					a[j] =a[j+1];
					a[j+1] =num;
					flag=1;
					
				}
				
				}
			if(flag==0) {
				break;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("**********ArrayForLoopAscending**********");
			System.out.print(a[i]+" ");
		}
	}
	
	public static void descendingArray(int[] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("descending order ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
