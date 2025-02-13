//22BCS17234
//Sachin Singh

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter the string:");
	    String s2= sc.nextLine();
	    String s=s2.toLowerCase();
	    System.out.println(s);
	    int Vcount=0;
	    int Ccount=0;
	    int Dcount=0;
	    int Scount=0;
	    for(int i=0;i<s.length();i++)
	    {
	        char ch=s.charAt(i);
	        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u')
	        {
	            Vcount++;
	        }
	        else if(Character.isDigit(ch))
	        {
	            Dcount++;
	        }
	        else if(Character.isLetter(ch))
	        {
	            Ccount++;
	        }
	        else if(!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch) )
	        {
	            Scount++;
	        }
	    }
	    System.out.print("VowelCount:");
		System.out.println(Vcount);
		
		System.out.print("ConsonantCount:");
		System.out.println(Ccount);
		
	    System.out.print("DigitCount:");
		System.out.println(Dcount);
	   
		System.out.print("SpecialcharCount:");
		System.out.println(Scount);
	}
}
