import java.util.Scanner;
public class Assignment01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		System.out.println("Enter given : "+n);
		System.out.println("Binary equivalent : "+Integer.toBinaryString(n));
		System.out.println("Octal equivalent  : "+Integer.toOctalString(n));
		System.out.println("Hexadecimal equivalent  : "+Integer.toHexString(n));
	}

}
