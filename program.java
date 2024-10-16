import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number  : ");
		if(!sc.hasNextDouble() || sc.hasNextInt())
		{
			System.out.println("First number isn't double");
			return;
		}
		double d1=sc.nextDouble();
		System.out.println("Enter the second number : ");
		if(!sc.hasNextDouble() || sc.hasNextInt())
		{
			System.out.println("Second number isn't double");
			return;
		}
		double d2=sc.nextDouble();
		System.out.println("Average : "+((d1+d2)/2));
	}
}
