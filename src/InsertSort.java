
public class InsertSort {
	
	
	public static void main(String[] args)
	{
		int[] arraySort={21,30,-1,-20,2};
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<arraySort.length;firstUnsortedIndex++)
		{
			int newElement=arraySort[firstUnsortedIndex];
			
			int i;
			for(i=firstUnsortedIndex;i>0 && arraySort[i-1]>newElement; i--)
			{
				arraySort[i]=arraySort[i-1];
			}
			
			arraySort[i]=newElement;
			
		}
		
		
		for(int i=0;i<arraySort.length;i++){
			System.out.println(arraySort[i]);
		}
	

	}
}
