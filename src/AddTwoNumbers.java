import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {
	
	private Map<Integer,Integer> arrayMap;

	private  int[] addindices(int a[], int target) {
		// TODO Auto-generated method stub
		
		arrayMap = new HashMap<>();
		
		for (int i=0; i<a.length;i++ )
		{
			
          arrayMap.put(i,a[i]);
			
		}
		
		System.out.println(arrayMap.size());
		for (int j=0;j<arrayMap.size();j++)
		{
			System.out.println(j+"======"+arrayMap.get(j+1));
			if(target==arrayMap.get(j)+arrayMap.get(j+1))
			{
				return new int[] {j,j+1};
			}
		
		}
		System.out.println(arrayMap.size());
		return null;
	
		
	}
	
	public static void main(String args[])
	{
		
		AddTwoNumbers add=new AddTwoNumbers();
		
		int a[]={2,2,1,4};
		
		int target = 5;
		
		int a1[]=add.addindices(a,target);
		
 System.out.println(Arrays.toString(a1));			

	}

	

}
