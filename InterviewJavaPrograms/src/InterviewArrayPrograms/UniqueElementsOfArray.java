package InterviewArrayPrograms;

public class UniqueElementsOfArray {
	
	public static void uniqueArray(String[] a) {
		
		for(int i=0;i<a.length;i++)
		{
			boolean unique = false;
			for(int j=0;j<i;j++) {
				if(a[i].equals(a[j])) {
					unique = true;
					break;
				}
			}
			if(!unique) {
				System.out.println(a[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		String[] arr = {"apple", "mango", "grape", "apple", "grape"};
		uniqueArray(arr);
		

	}

}
