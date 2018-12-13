
public class LongestPalindrome {

	private int palindromebeginsat;
	private int max_length;

	public String longestPalindrome(String s) {
		
		int n=s.length();
			
			boolean[][] palindromes=new boolean[n][n];
			for (int i=0; i<s.length();i++)
			{
			  
				palindromes[i][i]=true;
		        palindromebeginsat = i;
		              max_length = 1;
			}
			
			
			for (int i=0; i<s.length()-1;i++)
			{
				
				if(s.charAt(i)==s.charAt(i+1))
				{
					palindromes[i][i+1]=true;
		             palindromebeginsat = i;
		              max_length = 2;
				}
			}
			
			
			
			
			for(int curr_length=3;curr_length<=s.length(); curr_length++)
			{
				for (int i=0; i<s.length()-curr_length+1;i++)
				{
					int j=i+curr_length-1;
					
					if(s.charAt(i)==s.charAt(j) && palindromes[i+1][j-1])
					{
						palindromes[i][j]=true;
						max_length=curr_length;
						palindromebeginsat=i;
		                
		                System.out.println(palindromebeginsat+" " +max_length +""+curr_length);
					}
					
					
				}
				
			}
			
			
			
			
			
			return s.substring(palindromebeginsat,max_length+palindromebeginsat);
		        
		    }

}
