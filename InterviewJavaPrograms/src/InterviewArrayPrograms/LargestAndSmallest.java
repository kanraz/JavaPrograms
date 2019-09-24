package InterviewArrayPrograms;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = {2,5,3,8,6,9,10,1};
		largest(arr);
		System.out.println("largest number is "+largest(arr));
		System.out.println("smallest number is "+smallest(arr));

	}
 public static int largest(int[] a)
 {
	 int largest = a[0];
	 for(int i=0;i<a.length;i++)
	 {
		 if(largest<a[i])
		 {
			 largest = a[i];
		 }
	 }
	 //System.out.println("largest number is "+largest);
	 return largest;
 }
 
 public static int smallest(int[] b)
 {
	 int small =b[0];
	 for(int i=0;i<b.length;i++)
	 {
		 if(small>b[i])
		 {
			 small =b[i];
		 }
	 }
	 return small;
 }
}
