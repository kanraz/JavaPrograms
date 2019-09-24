package InterviewArrayPrograms;

public class ThreeDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][][] = new int[3][3][3];
		arr[0][0][0] = 1;
		arr[0][0][1] = 2;
		arr[0][0][2] = 3;
		
		arr[0][1][0] = 4;
		arr[0][1][1] = 5;
		arr[0][1][2] = 6;
		
		arr[0][2][0] = 7;
		arr[0][2][1] = 8;
		arr[0][2][2] = 9;
		
		arr[1][0][0] = 11;
		arr[1][0][1] = 12;
		arr[1][0][2] = 13;
		
		arr[1][1][0] = 21;
		arr[1][1][1] = 22;
		arr[1][1][2] = 23;
		
		arr[1][2][0] = 31;
		arr[1][2][1] = 32;
		arr[1][2][2] = 33;
		
		arr[2][0][0] = 41;
		arr[2][0][1] = 42;
		arr[2][0][2] = 43;
		
		arr[2][1][0] = 51;
		arr[2][1][1] = 52;
		arr[2][1][2] = 53;
		
		arr[2][2][0] = 61;
		arr[2][2][1] = 62;
		arr[2][2][2] = 63;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.print(arr[i][j][k]);
				}
				System.out.println();
			}
			//
		}
			

	}

}
