package Tester;

import java.util.Scanner;

public class StrPalindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check if it is palindrome: ");
		String str = sc.next();
		boolean flag = true;
		for(int i=0, j=(str.length()-1);i<j; i++, j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
			flag = false;
			break;
			}
		}	
			{
				if(flag==true)
					System.out.println("Bhai hai ye PALINDROME");
				else 
					System.out.println("NAAH BHAI...NAHI HAI PALINDROME..KR LE KUCH JUGAAD");
			}
		
	}
		

}
