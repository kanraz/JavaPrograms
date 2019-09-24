package InterviewArrayPrograms;

public class duplicatenumbers {

	public static void main(String[] args) {
		int[] arr = {4,3,4,5,6,7,5,2,9,7,6};
				duplicate(arr);
		
	}
	public static void duplicate(int[] arr)
	{
		System.out.print("duplicate values are ");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]==arr[j])&&(i!=j))
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
