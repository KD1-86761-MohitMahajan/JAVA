package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc)
	{
		System.out.println("Menu");
		System.out.println("\t0.Exit");
		System.out.println("\t1.Add Mango");
		System.out.println("\t2.Add Orange");
		System.out.println("\t3.Add Apple");
		System.out.println("\t4.Display fruits in basket");
		System.out.println("\t5.DIsplay fruit details in basket");
		System.out.println("\t6.Display tastes of all stale fruits");
		System.out.println("\t7.Mark a fruit as stale ");
		System.out.println("\t8.Mark all sour fruits stale");
		int choice=sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fruitbasket size : ");
	    int n=sc.nextInt();
	    Fruit basket[]=new Fruit[n];
	    int choice,index=0;
		while((choice=menu(sc))!=0)
	    {
	    	switch(choice)
	    	{
	    	case 1:
	    		if(index<n)
	    		{
	    			basket[index]=new Mango();
	    			basket[index].setName("Mango");
	    			basket[index].accept(sc);
	    			index++;
	    		}
	    		else
	    			System.out.println("Basket is full");
	    		break;
	    	case 2:
	    		if(index<n)
	    		{
	    			basket[index]=new Orange();
	    			basket[index].setName("Orange");
	    			basket[index].accept(sc);
	    			index++;
	    		}
	    		else
	    			System.out.println("Basket is full");
	    		break;
	    	case 3:
	    		if(index<n)
	    		{
	    			basket[index]=new Apple();
	    			basket[index].setName("Apple");
	    			basket[index].accept(sc);
	    			index++;
	    		}
	    		else
	    			System.out.println("Basket is full");
	    		break;
	    	case 4:
	    		System.out.println("List of all fruits in basket : ");
	    		for(int i=0;i<basket.length;i++)
	    		{
	    			System.out.println("Fruit "+(i+1));
	    			System.out.println("\t"+basket[i].getName());
	    		}
	    		break;
	    	case 5:
	    		System.out.println("Details of fruits in basket : ");
	    		for(int i=0;i<basket.length;i++)
	    		{
	    			System.out.println("Fruit "+(i+1));
	    			System.out.println("\t"+basket[i].toString());
	    		}
	    		break;
	    	case 6:
	    		System.out.println("Teste of not fresh fruits : ");
	    		for(int i=0;i<basket.length;i++)
	    		{
	    			boolean flag=basket[i].isFresh();
	    			if(flag==false)
	    			{
	    				System.out.println("Fruit "+(i+1));
		    			System.out.println("\tTaste : "+basket[i].taste());
	    			}
	    		}
	    		break;
	    	case 7:
	    		System.out.println("Enter the index to mark stale : ");
	    		int position=sc.nextInt();
	    		if(position<basket.length && position>=0)
	    		{
	    			basket[position].setFresh(false);
	    		}
	    		else
	    			System.out.println("Invalid index");
	    		break;
	    	case 8:
	    		for(int i=0;i<basket.length;i++)
	    		{
	    			if(basket[i].taste().equals("sour"))
	    			{
	    				basket[i].setFresh(false);
	    			}
	    		}
	    		break;
	    	}
	    }
		System.out.println("Exiting program");
	    
	}

}
