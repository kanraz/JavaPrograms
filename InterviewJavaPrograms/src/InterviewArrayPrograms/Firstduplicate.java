package InterviewArrayPrograms;

import java.util.HashSet;

public class Firstduplicate {

	public static void main(String[] args) {
		int arr[] = {3,4,2,5,7,4,8,5,6};
		firstdup(arr);
		collectionsDup(arr);
		

	}
	public static void firstdup(int[] a) {
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&i!=j) {
					
					System.out.println("first duplicate number is "+a[j]);
					temp=temp+1;
					break;
				}
			}
			if(temp==1) {
				break;
			}
		}
		
	}
	public static void collectionsDup(int[] a)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		int temp = -1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(hs.contains(a[i]))
			{
				temp=i;
			}
			else
			{
				hs.add(a[i]);
				
			}
			
		}
		if(temp!=-1) {
			System.out.println("first duplicate element is "+a[temp]);
		}
		else
			System.out.println("no duplicate element found");
		
	}
}
