
public class SortArrayElementBinarySearch {
	
	public static void main(String args[])
	{
		int nums[]={1,2,2,2};
	
		
		System.out.println(searchRangeLast(nums, 2));
		System.out.println(searchRangeFirst(nums, 2));
		
	
		
	}
	
	
	
	 private static int searchRangeFirst(int[] nums, int target) {

		 int start=0;
		 int end=nums.length-1;
		
		
		 while(start<=end){
			 
		 int mid=(start + end)/2;
		 
	
		 
		 if ((nums[mid]==target) && ((mid==start) || (nums[mid-1]<target) ))
		 {
			return mid;
		 }
		 
		 else if(nums[mid]>target || nums[mid]==target)
		 {
			 end=mid-1;
			 
		 }
		 else
		 {
			 start=mid+1;
		 }
		
	

}
		return -0;
	 }




	public static int searchRangeLast(int[] nums, int target) {
		 
		 int start=0;
		 int end=nums.length-1;
		
		
		 while(start<=end){
			 
		 int mid=(start + end)/2;
		 
	
		 
		 if ((nums[mid]==target) && ((mid==end) || (nums[mid+1]>target) ))
		 {
			return mid;
		 }
		 
		 else if(nums[mid]<target || nums[mid]==target)
		 {
			 start=mid+1;
			 
		 }
		 else
		 {
			 end=mid-1;
		 }
		

}
		return -1;
	 }
}

