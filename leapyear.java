import java.util.Scanner;
public class leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arg;
	        Scanner as=new Scanner(System.in);
	        System.out.println("Enter the year");
	        arg=as.nextInt();
	       	        if(arg%4==0||arg%400==0){
	        	 System.out.println("Leap year");
	        }else{
	        	 System.out.println("Not a leap year");
	        }
	        	
	}

}
