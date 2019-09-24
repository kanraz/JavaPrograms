package InterviewArrayPrograms;

public class ArrayMissing {

	public static void main(String[] args) {
		int a[]= {1,2,4,5};
		int sum=0;
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		int misnum=sum1-sum;
		System.out.println("missing number is "+misnum);
		//int x *= 9;
		System.out.println();
		
		
	}

}
