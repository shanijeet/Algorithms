
public class LongestCommonPrefixUsingBinarySearch {
	
	
	 public String longestCommonPrefix(String[] strs) {
			
			int minValue=Integer.MAX_VALUE;
			
			for(String str:strs)
			{
			minValue=Math.min(minValue, str.length());
		
			}
			
			int low=1;
			int high=minValue;
			
			
			while(low<=high)
			{
				int mid=(low+high)/2;
			if(commonPrefix(strs,mid))
			{
				low=mid+1;

			}
			else{
				high=mid-1;
				
			}
			
			}
			return strs[0].substring(0, (low+high)/2);
			
			

			
			  }

			private boolean commonPrefix(String[] strs,int m) {
				
				// TODO Auto-generated method stub
				
				String str1=strs[0].substring(0,m);
				
				for(int i=1;i<strs.length;i++)
				{
					if(!strs[i].startsWith(str1))
					{
						return false;
					}
				}
				
				return true;
				
				
			}
}