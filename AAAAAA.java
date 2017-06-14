
public class AAAAAA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxRows = 3;
		    int maxCols = 4;

		    int [] onedArray = new int [maxRows];
		        for (int i = 0; i < maxRows; i++){
		        onedArray[i] = (int) ((Math.random() * 100) * maxCols);
		    }

		    int [][] twodArray = new int[maxRows][];
		        for (int i = 0; i < maxRows; i++){
		        twodArray[i] = new int[maxCols];
		    }

		        for (int i = 0; i < twodArray.length; i++){
		        for (int j = 0; j < twodArray[i].length; j++){
		            twodArray[i][j] = (int) (Math.random() * 100);
		        }
		    }

		    System.out.println("2 - The 2D array: ");
		    for (int i = 0; i < twodArray.length; i++){
		        for (int j = 0; j < twodArray[i].length; j++){
		            System.out.print(twodArray[i][j] + " ");
	}
		        System.out.println("");
		    }
		    int maxValue = 1;
		    System.out.println("\nMax values in 2D array: ");
		    for (int i = 0; i < twodArray.length; i++) {
		        for (int j = 0; j < twodArray.length; j++)
		        if (twodArray[i][j] > maxValue) {
		        maxValue = twodArray[i][j];
		        }
		            System.out.println(maxValue);break; 
		        }



		}
	}


