import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
	


	private int palindromebeginsat;
	private int max_length;

	public boolean isPalindrome(int x) {
    	
    	int i=1;
    	int length=0;
    	int k=0;
    	boolean ispalindrome=true;
 
    	List<Integer> a1=new ArrayList<>();
    	
    	
    	while(i>0)
    	{
    		i=i/10;
    		k=i%10;
    		length++;
    		a1.add(k);
    		
    	
    	}
    	Object[] a2=a1.toArray();
    	boolean a[][]=new boolean[length][length];
    	
       
    	for(int j=0;j<length;j++)
    	{
    		a[j][j]=true;
    		 palindromebeginsat = i;
             max_length = 1;
    	}
    	for(int j=0;j<length-1;j++)
    	{
    		if(a2[i]==a2[i+1])
    		{
    		a[j][j+1]=true;
    		max_length=2;
			palindromebeginsat=i;
    		}
    		
    	}
    	
    	for(int curr_length=3;curr_length<=length; curr_length++)
		{    
    		
    		
			for (int i1=0; i1<length-curr_length+1;i1++)
			{
				int j1=i1+curr_length-1;
				
				if(a2[i1]==a2[j1] && a[i1+1][j1-1])
				{
					a[i1][j1]=true;
					max_length=curr_length;
					palindromebeginsat=i;
				    	
				}
			
				
				
			}
			
		}
    	
    	if(palindromebeginsat==0 && max_length==length)
    	{
    		ispalindrome=true;
    	}
    	else
    	{
    		ispalindrome=false;
    	}
		return ispalindrome;
		
    	
    	
    	
    	
    	
		
    }

}
