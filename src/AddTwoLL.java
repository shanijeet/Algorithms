import java.util.Iterator;
import java.util.LinkedList;

public class AddTwoLL {
	
	
	
	private static Integer l1Element;
	private static Integer l2Element;



	public static void main(String args[])
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(8);
		l2.add(9);
		l2.add(9);
		
		 addLinkedList(l1,l2);
		 
		
	}

	

	private static LinkedList<Integer> addLinkedList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		
		Iterator<Integer> i1=l1.iterator();
		Iterator<Integer> i2=l2.iterator();
		LinkedList<Integer> l3=new LinkedList<>();
		int carry=0;
		int sum;
		while(i1.hasNext() && i2.hasNext())
		{
		
		l1Element = i1.next();
		l2Element = i2.next();
		sum=l1Element+l2Element+carry;
		if((sum/10)>0)
		{
			carry=(sum/10);
		}
		//l3.add(sum%10);
		l3.addFirst(sum%10);
		
		}
		
		l3.addFirst(carry);
		
		
		 System.out.println(l3);
		return l3;
		
			

		
		
		
		
		
	}

}
