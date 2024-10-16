import java.util.Scanner;
public class Assignment02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int totalBill=0,items=1,choice=0;
		do
		{
			System.out.println("Menu");
			System.out.println("1.Dosa");
			System.out.println("2.Samosa");
			System.out.println("3.Idli");
			System.out.println("4.Mendu wada");
			System.out.println("5.Vadapav");
			System.out.println("6.Misal pav");
			System.out.println("7.Chai");
			System.out.println("8.Coffee");
			System.out.println("9.Pohe");
			System.out.println("10.Generate Bill");
			System.out.print("Enter you choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(50*items);
			       break;
			case 2:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(20*items);
			       break;
			case 3:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(30*items);
			       break;
			case 4:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(30*items);
			       break;
			case 5:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(20*items);
			       break;
			case 6:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(50*items);
			       break;
			case 7:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(15*items);
			       break;
			case 8:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(30*items);
			       break;
			case 9:
			System.out.print("Quantity of items : ");
	        items=sc.nextInt();
	        totalBill=totalBill+(20*items);
			       break;
			}
		}while(choice!=10);
		System.out.println("--------------------------");
		System.out.println("Bill : "+totalBill);
		System.out.println("--------------------------");
	}

}
