package InterviewArrayPrograms;

public class KthLargestElement {

	public static void main(String[] args) {
		int arr[]= {2,6,9,22,11,7,4,8,10,45,43};
		kthLargest(arr);
		
	}
	public static void kthLargest(int[] a)
	{
		int temp;
		int k=4;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println("kth largest element is "+a[i]);
				break;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
