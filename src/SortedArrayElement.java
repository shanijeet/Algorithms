import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SortedArrayElement {
	
	public static void main(String args[])
	{
		int nums[]={1,2,2,2};
	
		
		System.out.println(searchRange(nums, 2));
		
	
		
	}
	
	
	
	 public static int searchRange(int[] nums, int target) {
		 
		 int indices=0;;
		 HashMap<Integer,Integer> a=new HashMap<>();
		 
		// List<Integer> indices=new LinkedList<>();
		
		 for (int i=0;i<nums.length;i++)
		 {
			 System.out.println(a);
			a.put(i,nums[i]);
				
		 }
		 
		Set<Integer> set=a.keySet();
		
	for(int j:set)
	{
		if(a.get(j)==target)
		{
			//indices.add(j);
			indices=j;
		}
	}
		
		return indices;
		
		
	        
	    }
	 

}

