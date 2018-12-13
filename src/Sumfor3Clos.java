import java.util.Arrays;

public class Sumfor3Clos {

	
	 public int threeSumClosest(int[] nums, int target) {
		 
		 int min=Integer.MAX_VALUE;
	        
	        if(nums==null || nums.length<3)
				return 0;
			Arrays.sort(nums);
	    
			
			for(int i=0;i<nums.length-2;i++)
			{
				if(i==0 || nums[i]!=nums[i-1])
				{
					int j=i+1;
					int k=nums.length-1;
					while (j<k){
	                    int l=nums[i]+nums[j]+nums[k];
	                    
	                    int result=Math.abs(l-target);
	                    
	                    min=Math.min(result, min);
	                    System.out.println(nums[i]+" "+nums[j]+" "+nums[k]+" "+l);
	                    
	                    j++;
	                    k--;
					
				}
			}
			
			
	}
			int sum=min+target;
	        return sum;
	        
	    }

}
