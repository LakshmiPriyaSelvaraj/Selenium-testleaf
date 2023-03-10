package week1.day2;

public class Calculator {

	
		public int add(int n1,int n2,int n3) {
			int sum=0;
			sum=n1+n2+n3;
			return sum;
			
		}
		public int mul(int num1, int num2) {
			int mul=0;
			mul=num1*num2;
			return mul;
		}
		public void sub() {
			System.out.println("Inside sub block");
		}
		
		public static void main(String[] args) {
			Calculator cal=new Calculator();
			cal.add(1, 2, 1);
			System.out.println(cal.add(1, 5, 6));
			System.out.println(cal.mul(2, 2));
			cal.sub();
	}

}
