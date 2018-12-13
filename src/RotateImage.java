
public class RotateImage {
	 public void rotate(int[][] matrix) {
	        


	String[][] data = new String[3][5];
		int len1 = matrix.length;
		int len2 = matrix[0].length;

		for (int i=0; i<len1;i++)
		{
			for(int j=i;j<len2;j++)
			{
				int temp=0;
				temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
		
		for (int i=0; i<len1;i++)
		{
			for(int j=0;j<len1/2;j++)
			{
				int temp=0;
				temp=matrix[i][j];
				matrix[i][j]=matrix[i][len1-1-j];
				matrix[i][len1-1-j]=temp;
			}
		}
		
		
	
	


}

}
