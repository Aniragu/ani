import java.util.Scanner;
public class Natural {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x, i = 1 ;

        int sum = 0;

        System.out.println("Enter Number of items :");

        Scanner s = new Scanner(System.in);

        x = s.nextInt();

        while(i <= x)

        {

            sum = sum +i;

            i++;

        }

        System.out.println("Sum of "+x+" numbers is :"+sum);

    } 


	}


