package week1.day2;

import java.util.Arrays;
import static java.util.Arrays.sort;
public class MissingElements {
	

	public static void main(String[] args) {
//		boolean flag=false;
//		int res=0;
		int[] arr = {1,2,3,4,7,6,8};
		int len=arr.length;
		Arrays.sort(arr);
		for(int i=1;i<len;i++)
		{
			if(i!=arr[i-1])
			{
//				flag=true;
//				res=i;
//				break;
				System.out.println(i);
				break;
			}
		}
//		if(flag==true)
//			System.out.println(res);
			
	}

}
