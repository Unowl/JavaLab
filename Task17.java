import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Task17
{
    public static void main(String[] args) {
        
	    try {
	        File file =  new File("C:\\Users\\Public\\Test\\m.txt");
            Scanner scanner = new Scanner(file);
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n]; 
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                } 
            } 
	        Integer[][] matrixT = new Integer[n][n];
	    
	        for (int i = 0; i < n; i++){
	            for (int j = 0; j < n; j++){
	                matrixT[i][j] = matrix[j][i];
	            }
	        }
            System.out.println("Matrix:");
	        for(int i = 0; i< n; i++){
	    	    for(int j = 0; j < n; j++){
		            System.out.print(matrix[j][i] + " ");
	    	    }
	    	    System.out.println();
	        }
	        System.out.println("MatrixT:");
	        for(int i = 0; i< n; i++){
	    	    for(int j = 0; j < n; j++){
		            System.out.print(matrixT[j][i] + " ");
	    	    }
	    	    System.out.println();
	        }
	    }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();                   
        }
    }
}