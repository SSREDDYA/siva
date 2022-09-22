package java_Programs;

public class _3_Alternative_Word_Reverse2
{

	public static String main(String[] args)
	{
		// TODO Auto-generated method stub

		String s = "online testing help krishsoft";
		
		System.out.println("Original sentance..:-"+s);

		 String result = "";
		   String[] words = s.split(" ");
		   // we'll reverse only every second word according to even/odd index
		   for (int i = 0; i < words.length; i++)
		   {
		       if (i % 2 == 1)
		       {
		           result += " " + reverse(words[i]);
		       }
		       else
		       {
		           result += " " + words[i];
		       }
		   }
		   return result; 
		}

	private static String specialReverse(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String reverse(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	

		
		
		
	}


