package Krishna_Sir_Assignments;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;

public class _4__Word_Reverse
{

	public static void main(String[] args)
	{
		
		
		String  str = "siva sankar reddy ankireddypalle";
		String temp= "";
		System.out.println("Original Sentance...= "+str);	
		//Reverse String 
		for(int i=str.length()-1;i>=0;i--)
		{
	  temp=temp+str.charAt(i);
	  
		}
	
		System.out.println("Reverse Sentance...= "+temp);	
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
	  temp=temp+str.charAt(i);
	  int siva= str.length()-1;
	  
	 
		}
	
		System.out.println("Reverse Sentance...= "+temp);	
		
		
		//Reverse sentance in same order
		
		 String words[]=str.split("\\s");  
		    String temp1="";  
		    for(String w:words)
		    {  
		        StringBuilder sb=new StringBuilder(w);  
		       sb.reverse();
		       
		      // temp1=temp1+sb.toString()+" "; 
		          temp1+=sb.toString()+" "; 
		        String  temp2=sb.toString()+" ";
		          System.out.println("11Reverse Sentance...= "+sb.append(str));	 
		          
		    }  
		    System.out.println("Reverse sentance in same order..:-"+temp1);
		    
		
		
		
		
		
		
		
		
		
		
	}
	}


