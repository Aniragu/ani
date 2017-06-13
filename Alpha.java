import java.util.Scanner;
public class Alpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char arg;
        Scanner as=new Scanner(System.in);
        arg=as.next().charAt(0);
        if((arg>='a'&&arg<='z')||(arg<='A'&&arg>='Z')){
        	System.out.println("Alphabet");
        	
        }else{
        	System.out.println("not Alphabet");
        }
	}

}
