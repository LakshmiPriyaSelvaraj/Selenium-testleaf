package week1.day1;
import java.util.Scanner;
public class PrimeOrNot {

	public static void main(String[] args) {
		boolean flag= false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked for prime or not: ");
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag= true;
				break;
			}
		if(flag==true)	
			System.out.println("The given numer "+n +" is not a prime number");
		else
			System.out.println("The given numer "+n +" is a prime number");
			
			
		}
		

	}

}
