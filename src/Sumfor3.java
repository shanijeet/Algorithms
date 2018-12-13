import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sumfor3 {
	


public List<List<Integer>> threeSum(int[] nums) {

	  
	 Set<List<Integer>> set=new HashSet<>(); 
	 List<Integer> list = null;
	 
	 for(int i=0; i<=nums.length-3; i++)
	 {
		 
		 for (int j=i+1;j<=nums.length-2;j++)
		 {
			 
			 for(int k=j+1;k<=nums.length-1;k++)
			 {
                
                System.out.println(i+" "+j+" "+k);
		 if(nums[i]+nums[j]+nums[k]==0){
			 list=new LinkedList<>();
			 list.add(nums[i]);
			 list.add(nums[j]);
			 list.add(nums[k]);
            
             Collections.sort(list);
            
       
            set.add(list);
			 
           
            
            
		 }
		 
		 
               
			 }
		 }
		 
	 }
	return set.stream().collect(Collectors.toList());
       
   }
}
