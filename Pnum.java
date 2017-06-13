import java.util.Scanner;
public class Pnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=2,p=3,result=1;
		 
		    if(n>=0&&p==0)
		     {
		        result=1;
		     }
		    else if(n==0&&p>=1)
		      { 
		         result=0;
		      }
		    else
		     {
		         for(int i=1;i<=p;i++)
			 {
		            result=result*n;
		 	 }	    
		     }
		    System.out.println(n+"^"+p+"="+result);
			
		  }
		
	}


