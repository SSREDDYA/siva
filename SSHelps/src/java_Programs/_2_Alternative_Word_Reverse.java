package java_Programs;

public class _2_Alternative_Word_Reverse
{

	public static void main(String[] args)
	{
		
		String s = "online testing help krishsoft";
		
		System.out.println("Original sentance..:-"+s);

		//String sentence = "online testing help krishsoft";
		   System.out.println("Alternative word reverse ..:-"+specialReverse(s)); 
		}

		public static String specialReverse(String s)
		{
		   String result = "";
		   String[] words = s.split(" ");
		   // we'll reverse only every second word according to even/odd index
		   for (int i = 0; i < words.length; i++)
		   
		   {
		       if (i % 2 == 1)
		       {
		           result += " " + reverse(words[i]);
		       } else
		       {
		           result += " " + words[i];
		       }
		   }
		   return result;
		}

		// easiest way to reverse a string in Java in a "one-liner"
		public static String reverse(String word) {
		   return new StringBuilder(word).reverse().toString();
		}

	}


