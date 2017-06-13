import java.util.Scanner;
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int i,flag=0;
             int n;
             Scanner ss=new Scanner(System.in);
             i=ss.nextInt();
             for(n=i;n<=i/2;i++){
            	 if(n%2==0){
            	 flag=1;
            	 }
             }if(flag==0){
            	 System.out.println("prime numbers");
             }
             else{
            	 System.out.println("not prime numbers");
             }
	}

}
