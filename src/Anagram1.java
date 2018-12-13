import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram1 {
	
public List<List<String>> groupAnagrams(String[] strs) {
	
	if(strs==null){
		return new ArrayList();
	}
	Map<String,List> gA=new HashMap<String, List>();
	
	for(String s: strs)
	{
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		String key=String.valueOf(ch);
		if(!gA.containsKey(key))
		{
			gA.put(key, new ArrayList());
		}
		gA.get(key).add(s);
	}
	return new ArrayList(gA.values());
        
    }

}
