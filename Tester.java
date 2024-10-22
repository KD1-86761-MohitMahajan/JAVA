package Tester;

import java.util.Scanner;

import customexceptions.StrTooLongException;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter any string: ");
			String str =  sc.nextLine();
			if(str.length()> 80) {
				throw new StrTooLongException("Dekh bhai, jyada length ho rahi");
			}
		}
catch (StrTooLongException e)
		{
	e.printStackTrace();
		}

	}

		
	}
	

