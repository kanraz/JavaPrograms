package InterviewArrayPrograms;

import java.util.Scanner;

public class StringBackwardsWordByWord {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a new Sentence");
		String inputString = sc.nextLine();
		String outputString = reverseTheString(inputString);
		System.out.println("original sentence "+ inputString);
		System.out.println("reversed sentence "+ outputString);
		
		

	}
	public static String reverseTheString(String inputString)
	{
		String[] words = inputString.split("\\s");
		String outputString = "";
		for(int i=words.length-1;i>=0;i--)
		{
			outputString = outputString + words[i]+" ";
			
		}
		return outputString;
	}

}
