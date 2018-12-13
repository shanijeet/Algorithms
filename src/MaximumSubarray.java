
public class MaximumSubarray {

public int maxSubArray(int[] nums) {
	
	
	int result=0;
	for(int i=0; i<nums.length-1;i++)
	{
		int sum=nums[i];
		for (int j=i+1;j<nums.length;j++)
		{
			sum=sum+nums[j];
			result=Math.max(result, sum);
		}
	}
	return result;
	
	
	
	
        
    }
}
