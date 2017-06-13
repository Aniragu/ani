import java.util.Scanner;


public class Reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0,rev=0,n;
		  Scanner as=new Scanner(System.in);
		  System.out.println("Enter the string");
		  a=as.nextInt();
		while(a!=0){
		
			n=a%10;
			rev=rev*10+n;
			a=a/10;
			
		}System.out.println(rev);
	}

}
