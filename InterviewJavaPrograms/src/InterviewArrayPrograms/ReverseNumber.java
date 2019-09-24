package InterviewArrayPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;//
			num=num/10;
			
		}
		System.out.println(rev);
		
		long a=123456;
	StringBuffer s=	new StringBuffer(String.valueOf(a)).reverse();
	System.out.println(s);
	StringBuffer s3=new StringBuffer(String.valueOf(a)).reverse();
	
	}

}
