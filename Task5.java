
import java.util.Scanner;
public class Task5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3 ;//in.nextInt();
        String now = in.nextLine();
        String max = now;
        String min = now;
        for(int i = 0; i<n-1 ; i++){
            now = in.nextLine();
            
            if (max.length() < now.length()){
                max = now;
            }
            
            if (min.length() > now.length()){
                min = now;
            }
        
        }
        System.out.println("Вывод:");
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	    }
}
