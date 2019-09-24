package InterviewArrayPrograms;

public class SecondLargestSmallest {

	public static void main(String[] args) {
		int[] arr = {6,1,4,3,8,9,4,2,11,33,22};
		secondLargest(arr);
		secondSmallest(arr);

	}
	public static void secondLargest(int[] a)
	{
		int large=a[0];
		int secLarge = a[0];
		for(int i =0;i<a.length;i++)
		{
			if(large<a[i])
			{
				secLarge = large;
				large = a[i];
			}
			else if(secLarge<a[i]&&a[i]!=large)
			{
				secLarge = a[i];
			}
		}
		System.out.println("Largest number is "+large);
		System.out.println("second largest number is "+secLarge);
	}
	
	public static void secondSmallest(int[] b)
	{
		int small = b[0];
		int sec_small = b[0];
		
		for(int i=0;i<b.length;i++)
		{
			if(small>b[i])
			{
				sec_small = small;
				small=b[i];
			}
			else if(sec_small>b[i]&&b[i]!=small)
			{
			sec_small = b[i];
			}
		}
		System.out.println("Smallest number is "+small);
		System.out.println("Second smallest number is "+sec_small);
	}

}
