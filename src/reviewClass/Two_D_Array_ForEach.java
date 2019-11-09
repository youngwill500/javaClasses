package reviewClass;

public class Two_D_Array_ForEach {

	public static void main(String[] args) {
		
		int [][] intArray = {
				{2,3,4},
				{2,3,4},
				{2,3,4},
				{2,3,4}
		};
		
		for (int row =0; row < intArray.length; row++) {
			for(int col = 0; col < intArray[row].length; col++) {
				System.out.println(intArray[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("****************************************");
		
		
		for (int[] row: intArray) {
			
			for (int cols : row)  {
				
				System.out.print(cols+" ");
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
