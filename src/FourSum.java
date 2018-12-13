import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
	class Solution {
	    public List<List<Integer>> fourSum(int[] nums, int target) {
	    	
	    	Arrays.sort(nums);
	    	
	    	List<Integer> list1= new LinkedList<>();
	    	List<List<Integer>> list2= new LinkedList<>();
	    	
	    	
	    	for(int i=0;i<nums.length-3;i++)
	    	{
	    	int j=i+1;
    		int k=nums.length-1;
    		int l=k-2;
	    	while(j<k)
	    	{
	    		
	    		
	    		if(target==nums[i]+nums[j]+nums[k]+nums[l])
	    		{
	    			list1.add(nums[i]);
	    			list1.add(nums[j]);
	    			list1.add(nums[k]);
	    			list1.add(nums[l]);
	    		}
	    		else if(nums[i]+nums[j]+nums[k]+nums[l]>0)
	    		{
	    			k--;
	    			l--;
	    		}
	    		else
	    		{
	    			j++;
	    		}
	    	}
		
	        
	    }
	    	
	    	list2.add(list1);
			return list2;
	}
	}
}
