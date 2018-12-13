
public class SortAlgo {
	
	public static void main(String[] args)
	{
		int[] arraySort={21,30,-1,-20,2};
		
		
	
		
		//Bubble Sort Start---for(int lastunsortedindex=arraySort.length-1;lastunsortedindex>0;lastunsortedindex--)
		//{
			//for (int i=0;i<lastunsortedindex;i++)
			//{
				//if(arraySort[i]>arraySort[i+1])
				//{
					//swap(arraySort,i,i+1);
				//}
				
			//}
		//}Buuble Sort End---//
		
		
		for(int lastunsortedindex=arraySort.length-1;lastunsortedindex>0;lastunsortedindex--)
		{
			int largest=0;
			
			for(int i=1; i<=lastunsortedindex;i++){
				if(arraySort[i]>arraySort[largest])
				{
				 largest=i;
				}
			}
			swap(arraySort,lastunsortedindex,largest);
		}
		
		
		for(int i=0;i<arraySort.length;i++)
		System.out.println(arraySort[i]);
		
	}
	
	public static void swap(int[] arr, int i , int j)
	{
		if(i==j)
		{
			return;
		}
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		
	}

}
