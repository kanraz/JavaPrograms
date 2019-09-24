package InterviewArrayPrograms;

public class ArmstrongNumber {
	
	public static void number(int num)
	{
		int temp=0;
		int r;
		int t;
		t=num;
		while (num>0)
		{
			r = num%10;
			num = num/10;
			temp = temp+(r*r*r);
		}
		if (t==temp)
		{
			System.out.println("num is armstrong "+temp);
		}
		else System.out.println("number is not armstrong "+temp);
	}

	public static void main(String[] args) {
		
		//ArmstrongNumber a = new ArmstrongNumber();
	//	a.number(370);
		
		number(153);
		

	}

}
