package InterviewArrayPrograms;

import java.util.HashSet;

public class duplicateSetHashSet {
	public static void main(String[] args)
	{
		int[] arr = {4,3,4,5,6,7,5,2,9,7,6};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int num: arr)
		{
			if(hs.add(num)==false)
			{
				System.out.print(num+" ");
			}
			
		}
		System.out.println(hs);
	}

}
