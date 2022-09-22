package java_Programs;

import java.util.HashMap;
import java.util.Map;

public class repeted_letters_count 
{

	public static void main(String[] args)
	{


				 String str= "krish software solutions "; 
	   
	
	    //using hashmap to store unique character with integer count
				 
	    Map<Character,Integer> map1 = new HashMap<Character,Integer>();

	    for(int i=0; i < str.length(); i++)
	    {
	      char currentChar = str.charAt(i);
	      //to check that currentChar is not in map, if not will add 1 count for firsttime
	      if(map1.get(currentChar) == null)
	      {
	        map1.put(currentChar, 1); 
	      } 
	      /*If it is repeating then simply we will increase the count of that key(character) by 1*/
	      else
	      {
	        map1.put(currentChar, map1.get(currentChar) + 1);
	      }
	    }
	    //Now To find the highest character repeated 
	    int max=0;
	    char maxCharacter = 'i';//setting to a by default
	    for (Map.Entry<Character, Integer> entry : map1.entrySet())
	    {
	        System.out.println("Letter =" + entry.getKey() + ": repeted times :-" + entry.getValue());
	        if(max<entry.getValue())
	        {
	            max=entry.getValue();
	            maxCharacter=entry.getKey();
	      }
	    }
	    System.out.println("Max repeted letter is =" + maxCharacter + "- Count =" + max);
	  }
	
				    }  
		

		
