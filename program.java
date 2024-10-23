import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



public class program {
	
	public static int menu(Scanner sc)
	{
		System.out.println("Menu------>");
		System.out.println("\t0.Exit");
		System.out.println("\t1.sorted on their city (asc) ");
		System.out.println("\t2.sorted on their on marks (desc)  ");
		System.out.println("\t3.sorted on their on name asc ");
		System.out.println("\t4.sorted on the rollno");
		System.out.println("Enter Choice : ");
		return sc.nextInt();
	}
	
	public static void display(Student arr[]) {
		for(Student s:arr)
		{
			System.out.println("Student : ");
			System.out.println("\t"+s);
		}
	}
	
	public static void main(String[] args) {
		
		class StudNameSortCom implements Comparator<Student>{
			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getName().compareTo(s2.getName());
			}
			
		}
		class StudCitySortCom implements Comparator<Student>{
			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getCity().compareTo(s2.getCity());
			}
			
		}
		class StudMarksSortCom implements Comparator<Student>{
			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return Double.compare(s2.getMarks(), s1.getMarks());
			}
			
		}
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		Student s[]=new Student[5];
		s[0]=new Student(10,"Parag","Jalgaon",80);
		s[1]=new Student(30,"Mohit","Nagar",85);
		s[2]=new Student(50,"Mayur","Malkapur",80);
		s[3]=new Student(40,"Suyash","Jalgaon",90);
		s[4]=new Student(20,"Pranjal","vardha",95);
		
		while((choice=menu(sc))!=0)
		{
			switch(choice)
			{
			case 1:
				StudCitySortCom s1=new StudCitySortCom();
				Arrays.sort(s,s1);
				System.out.println("sorted on their city : ");
				display(s);
				break;
			case 2:
				StudMarksSortCom s2=new StudMarksSortCom();
				Arrays.sort(s,s2);
				System.out.println("sorted on their Marks : ");
				display(s);
				break;
			case 3:
				StudNameSortCom s3=new StudNameSortCom();
				Arrays.sort(s,s3);
				System.out.println("sorted on their Names : ");
				display(s);
				break;
			case 4:
				Arrays.sort(s);
				System.out.println("sorted on their roll numbers : ");
				display(s);
				break;
			default:System.out.println("Invalid choice!");
			}
		}
		System.out.println("Exiting program........");
	}

}
