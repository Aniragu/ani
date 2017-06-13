import java.util.Scanner;


public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i,n,sum=0;
	      
	      Scanner ss=new Scanner(System.in);
	      a=ss.nextInt();
	      while(a!=0){
	    		  n=a%10;
	    		  a=a/10;
	    		  sum=sum*10+n;
	    		 
	    		 
	    	  }if(a==sum){
	      System.out.println("palindrome");
	    	  }	      

		else{
			System.out.println("not palindrome");
		}}}

	


