package InterviewArrayPrograms;

public class largeAndSmallNumberInArray {

	public static void main(String[] args) {
		int [] arr = {4,3,7,6,8,2,6};
		int large = arr[0];
		int small = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(large<arr[i])
			{
				large = arr[i];
			}
		}
		System.out.println("largest number is "+large);
		for (int i = 0;i<arr.length;i++) {
			if(small>arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("smallet number in an array is "+small);
		
	}

}
