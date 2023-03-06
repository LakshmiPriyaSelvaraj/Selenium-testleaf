package week1.day1;

public class PRimeOrNotwithInput {

	public static void main(String[] args) {
		boolean flag=true;
		int n=9;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
//				System.out.println("The given number " + n +" is not prime");
				break;
			}
//			System.out.println("The given number " +n +" is prime");
//			break;
		}
		if(flag)
			System.out.println("The given number " + n +" is prime");
		else
			System.out.println("The given number " + n +" is not prime");
//		
		
//		System.out.println("The given number " +n +" is prime");
		
		
	}

}
