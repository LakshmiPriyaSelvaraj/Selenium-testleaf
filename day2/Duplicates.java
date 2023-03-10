package week1.day2;

public class Duplicates {
	
	
	public static void main(String[] args)
	{
//		boolean flag=false;
		int res=0;
		int[] nums= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
//					flag=true;
					res= nums[i];
					System.out.println(res);
					break;
				}
			}
		}
//		if(flag==true);
//		System.out.println(res);

	}

}
