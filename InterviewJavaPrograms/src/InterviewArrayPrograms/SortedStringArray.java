package InterviewArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedStringArray {

	public static void main(String[] args) {
		String arr[] = {"mango", "orange", "apple","blueberry","strawberry"};
		arrayList(arr);
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("*******reverseOrder***********");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	public static void arrayList(String []arr) {
		ArrayList<String> a1 = new ArrayList<String>();
		for(String a: arr)
		{
			a1.add(a);
		}
		System.out.println("*********arrayList*****************");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("*********SortedList***************");
		System.out.println(a1);
		System.out.println("**********DescendingOrderArrayList*********************");
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println(a1);
		
		
	}

}
