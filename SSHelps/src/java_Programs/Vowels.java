package java_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Vowels
{

	String str = "krish software Solution";
	//void characterCount(str);
	

	static void characterCount(String input){

	char[] charArray = input.toCharArray();

	int[] ASCII = new int[256];

	for(int I = 0; I < charArray.length;I++)
	{
	ASCII[charArray[I]] = ASCII[charArray[I]]+1;
	}

	
	int noOfVowels = 0;
	
	for(int I = 0; I < ASCII.length;I++){

	if(ASCII[I] > 0)
	{
	char ch = (char)I;
	
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'||ch == 'u'||
	ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'||ch == 'U'){
	noOfVowels = noOfVowels+ASCII[I] ;
	}


	}
	}
	System.out.println("Number of vowels = "+noOfVowels);
	
	for(int I = 0; I < ASCII.length;I++){

	if(ASCII[I] > 0){
	char ch = (char)I;
	System.out.println("Character ="+ch +" "+ASCII[I]);
	}
	}
	}

	}
