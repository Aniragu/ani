
import java.util.Arrays;
import java.util.Scanner;

public class Hunter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<a.length-1;i++)
	{
		if(a[i]==a[i+1])
		{
			System.out.println("duplicate is:"+a[i]);
		}
	
	}
	}

}
