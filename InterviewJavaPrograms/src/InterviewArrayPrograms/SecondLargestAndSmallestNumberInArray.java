package InterviewArrayPrograms;

public class SecondLargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		int[] arr = {2,9,8,4,10,5,7,20,11,22,44,22};
		int large = Integer.MIN_VALUE;
		int sec_large = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				sec_large = large;
				large = arr[i];
				
			}
			//if((sec_large<arr[i])&&(sec_large!=large))
			//{
			//	sec_large =arr[i];
			//}
			
		}
		System.out.println("largest number is "+large);
		System.out.println("second highest number is "+sec_large);
		
		/*int small = ;
		int sec_small = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(small>arr[i])
			{
				sec_small=small;
				small= arr[i];
			}
		}
		System.out.println("smallest number is "+small);
		System.out.println("second smallest number is "+sec_small);*/
	}

}
