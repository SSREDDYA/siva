package java_Programs;

public class Alternative_Word_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myName = "KSS Venkata Krishna";
		//First Character in my String
		char chr = myName.charAt(0);
		System.out.println("First Character is "+ chr);
		
		//Get last character
		System.out.println("Last character is "+ myName.charAt(myName.length()-1));



		
		
		/*String s = "online testing help krishsoft";
		
		System.out.println("Original sentance..:-"+s);

		String result=reverseAltWords(s);

		System.out.println("Alternative word reverse ..:-:-"+result.substring(1));

		}

		public static String reverseAltWords(String s)

		{

		String[] str=s.split(" ");

		String r="";

		for(int i=0;i<str.length;i++)

		{

		if(i%2==1)

		{

		str[i]=reverse(str[i]);

		}

		r=r+" "+str[i];

		}

		return r;

		}

		public static String reverse(String s)

		{

		String rev="";

		for(int i=s.length()-1;i>=0;i--)

		{

		rev=rev+s.charAt(i);

		}
		
		return rev;
		
		//System.out.println("Alternative word reverse ..:-"+  return rev);
		
		*/
		
	}

}
