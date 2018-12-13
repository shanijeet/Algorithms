
public class LongestCommonPrefix {



	  public String longestCommonPrefix(String[] strs) {

			int counter;

			int longestPrefixlength=0;
			for (int i=0;i<strs[0].length();i++)
			{
				char ch=strs[0].charAt(i);
		        counter=0;
				
				for (int j=1; j<strs.length;j++)
				{
					
		            
		           // System.out.println(strs[j].length() + " " +  ch +" " + i);
					if(strs[j].length()>i && ch==strs[j].charAt(i))
					{  
						counter++;
		                
		                 if(counter==(strs.length-1))
				            {
		                     
				            longestPrefixlength=i+1;
				            }
		                
					}
				}
		        
		       
				
				
			}
			
		        System.out.println(longestPrefixlength);
			
			
			return strs[0].substring(0,longestPrefixlength);
		        
		    }
}
