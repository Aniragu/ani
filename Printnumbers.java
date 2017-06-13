import java.util.Scanner;


public class Printnumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,flag=0;
         int n;
         Scanner ss=new Scanner(System.in);
         for(i=11;i<=99;i++){
        	 flag=0;                                                                                                                                                                                                                                                                                                                                                     
        	 for(n=i;i<=n/2;n++){
        		 if(n%2==0){
                	 flag=1;
                	 }
        	 }
        	 if(flag==0)
        	
         {
        	 System.out.println(i);
         }
     
}}}


	

