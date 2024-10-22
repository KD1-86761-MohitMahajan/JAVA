package Tester;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		String str = sc.next();
		System.out.println("The reverse string is: ");
	for(int i= str.length()-1; i >= 0; i--)
	{
		System.out.print(str.charAt(i));
	}
	}

}
