package com.project.javacodeunderstanding;
import java.util.Scanner;
public class MenuDrivenSoftware {

	public static void main(String[] args) {
		System.out.println("Welcome to my Software");
		System.out.println("7ECE5 Software Build 1.1");
		
		for(;;)
		{
			System.out.println("1. Factorial\n" // \n escape sequence
					+ "2. Reverse of a number\n"
					+ "3. Power of a number\n"
					+ "4. Length of a Number\n"
					+ "5. Summation of Numbers\n"
					+ "6. Check ArmStrong\n"
					+ "7. Check Strong\n"
					+ "8. Range of ArmStrong\n"
					+ "9. Range of Strong");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Choice: ");
			int choice = scan.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Factorial");
				System.out.println("Enter the NUmber: ");
				int num = scan.nextInt();
				
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int res = AllBasicCode.factorial(num);
					System.out.println(num + " != " + res);
				}
			}
			else if(choice == 2)
			{
				System.out.println("Reverse");
				
				System.out.println("Enter the Number: ");
				int num = scan.nextInt();
				
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int res = AllBasicCode.reverse(num);
					System.out.println(num + " reverse is " + res);
				}
				
			}
			else if(choice == 3)
			{
				System.out.println("Power");
				
				System.out.println("Enter the Base: ");
				int base = scan.nextInt();
				
				System.out.println("Enter the Exponent: ");
				int exp = scan.nextInt();
				
				int res = AllBasicCode.power(base, exp);
				System.out.println("The power is: " + res);
			}
			else if(choice == 4)
			{
				System.out.println("Length");
				
				System.out.println("Enter the Number: ");
				int num = scan.nextInt();
				
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int res = AllBasicCode.length(num);
					System.out.println("Length is: " + res);
				}
				
			}
			else if(choice == 5)
			{
				System.out.println("Summation");
				
				System.out.println("Enter the Number: ");
				int num = scan.nextInt();
				
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int res = AllBasicCode.summation(num);
					System.out.println("The sum is : " + res);
				}
			}
			else if( choice == 6)
			{
				System.out.println("Check ArmStrong");
				
				System.out.println("Enter the Number: ");
				int num = scan.nextInt();
				
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int res = AllBasicCode.armStrong(num);
					if(num == res) System.out.println("Im ArmStrong");
					else System.out.println("Im Not ArmStrong");
				}
			}
			else if(choice == 7)
			{
				System.out.println("Check Strong");
				
				System.out.println("Enter the Number: ");
				int num = scan.nextInt();
				
				if(num < 0) System.out.println("No Negatives");
				else
				{
					int res = AllBasicCode.strong(num);
					if(num == res) System.out.println("Im Strong");
					else System.out.println("Im Not Strong");
				}
			}
			else if(choice == 8)
			{
				System.out.println("Range of ArmStrong");
				
				System.out.println("Enter the range: ");
				int range = scan.nextInt();
				
				for(int i=1;i<=range;i++)
				{
					if(i == AllBasicCode.armStrong(i))
						System.out.println(i);
				}
			}
			else if(choice == 9)
			{
				System.out.println("Range of Strong ");
				
				System.out.println("Enter the range: ");
				int range = scan.nextInt();
				for(int i=1;i<=range;i++)
				{
					if(i == AllBasicCode.strong(i))
						System.out.println(i);
				}
			}
			else
			{
				System.out.println("SIR/MADAM Thats OK");
				System.out.println("You commited a mistake giving wrong choice");
				System.out.println("Try Again");
			}
			System.out.println("Do you want to Continue: Y/y");
			char ch = scan.next().charAt(0);
			
			if(ch == 'Y' || ch == 'y')
				continue;
			else
			{
				System.out.println("SIR/MADAM Thank you for using my Software");
				System.out.println("Happy and Have a great Day, Visit Again");
				break;
			}
		}
		

	}



	}


