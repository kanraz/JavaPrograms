package InterviewArrayPrograms;
import java.util.Hashtable;

public class StringRevSpecChar {

	public static void main(String[] args) {
		String s1="Selenium";
		String rev="";
		
		for( int i=s1.length()-1;i>=0;i--)
		{
			
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
		//2nd method
		StringBuffer s2= new StringBuffer(s1);
		s2.reverse();
		System.out.println(s2);
		
		//remove special characters from following string
		String sp="@###$ Selenium 123456 @#$%^&^%$# Java";
		sp=sp.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sp);
	}

}
