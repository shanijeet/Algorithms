
public class Indexof {
public int strStr(String haystack, String needle) {
	
	int i=needle.length();
	int value=-1;
	
	for (int j=0;i+j<haystack.length();j++)
	{
		String sub=haystack.substring(j, i+j);
		if(sub.equals(needle))
		{
	 value=j;
		 break;
		}
	}
	
	
	return value;
        
    }

}
