
public class StringToInteger {
	
	 public int myAtoi(String str) {
		 
		 
		 if(str==null)
		 {
			 return -1;
		 }
		 int i=0;
		 
		 char flag= '+';
		 
		 if(str.charAt(i)=='-')
		 {
			 flag='-';
			 i++;
		 }
		 else if(str.charAt(i)=='+')
		 {
			 i++;
		 }
		 
		 double result=0;
		 
		 while(str.length()>i && str.charAt(i)>'0' && str.charAt(i)<'9')
		 {
			result=result+(str.charAt(i) + '0');
		 }
		 
		 if(flag=='-')
		 {
			 result=-result;
		 }
		 if(result>Integer.MIN_VALUE)
		 {
			 return Integer.MIN_VALUE;
		 }
		 if(result>Integer.MAX_VALUE)
		 {
			 return Integer.MAX_VALUE;
		 }
		 
		return (int) result;
		 
		 
	        
	    }

}
