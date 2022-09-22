package java_Programs;

public class _4__Word_Reverse
{

	public static void main(String[] args)
	{
		
		String s = "siva sankar redddy";
		
		System.out.println("Original sentance..:-"+s);
		
		 String words[]=s.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  System.out.println("reverse sentance..:-"+reverseWord);
		    
		    
		    String myName = "KSS Venkata Krishna";
			String temp="";
			 System.out.println("Original myName sentance..:-"+myName);
			//How to reverse a string
			
				for(int i=myName.length()-1;i>=0;i--) {
				temp = temp + myName.charAt(i);
			}
			
			System.out.println("Reversed String is "+ temp);
		    
		   
		}

	}


