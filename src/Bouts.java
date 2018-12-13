import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bouts {	
	public static void main(String args[])
	{	
Map<String,Integer> stepstimestamp = new HashMap();
		int[] minutes=new int[60];
		int steps=0;
		int bouts=0;
		int counter=0;	
for (int i=0;i<60;i++)
{
	minutes[i]=i;
}
List<String> hoursmins=new ArrayList<>();
for (int hrs=0;hrs<12;hrs++)
{
	for(int mins: minutes)
	{
		String time=String.valueOf(hrs)+":"+String.valueOf(mins);
		
		hoursmins.add(time);
	}
}
Iterator<String> timeIterator=hoursmins.iterator();
while(timeIterator.hasNext())
{	steps=steps+1;
	stepstimestamp.put(timeIterator.next(), steps);	
}
Iterator it = stepstimestamp.entrySet().iterator();
for(String hm:hoursmins)
{ 
	if(it.hasNext())
	{
	bouts=bouts+stepstimestamp.get(hm);
	System.out.println(bouts);
	if(bouts>300)
	{
	counter++;
	bouts=0;
	}
	}	
}
System.out.println(counter);
}
}
	


