package InterviewArrayPrograms;

public class UniqueElementsString {
	public static void uniq(String[] arr) {
		boolean unique = true;
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=0;j<i;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					unique=false;
					break;
					//System.out.println(arr[j]);
				}
								
			}
			if(unique!=true)
			{
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
			String[] arr = {"mango","apple", "mango","orange","apple","strawberry"};
			uniq(arr);
	}

}
