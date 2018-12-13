
public class ShellSort {
	public static void main(String[] args)
	{
		int[] arraySort={21,30,-1,-20,2,-22,31,-3,50};
		
		int k=(arraySort.length)/2;
		
		int gap;
		
		for(gap=k; gap>1;gap--){
		
		
		
		
		//3-3
		//4-3
		int j=gap;//j=3
		
		
		
		//i=3, i=4
		for (int i=gap; i<arraySort.length; i++)
		{
			int newElement=arraySort[i];
			if(arraySort[i-j]>arraySort[i]){
				arraySort[i]=arraySort[i-j];
				arraySort[i-j]=newElement;
			}
			
			
		}
		}
		
		for(int firstUnsortedIndex=1;firstUnsortedIndex<arraySort.length;firstUnsortedIndex++)
		{
			int newElement=arraySort[firstUnsortedIndex];
			
			int i1;
			for(i1=firstUnsortedIndex;i1>0 && arraySort[i1-1]>newElement; i1--)
			{
				arraySort[i1]=arraySort[i1-1];
			}
			
			arraySort[i1]=newElement;
			
		}
		
		
		
		
		
		
		
		for(int i2=0;i2<arraySort.length;i2++){
			System.out.println(arraySort[i2]);
		}
	

	}

}
