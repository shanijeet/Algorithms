
public class CountandSay {

public String countAndSay(int n) {
	
	String s = "";
	int i1=0;
	
	for(int i=0;i<n;i++)
	{
	
	i1=s.length();
	s=Integer.toString(i1)+Integer.toString(i);
		
	}
	
	return s;
        
    }
}
