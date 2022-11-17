
import java.util.function.Function;
import java.util.Scanner;


	
public class Task20
{
    @FunctionalInterface
    public interface UnaryOperator<T> {
	    T power2(T x);
    }
    public static void main(String[] args) {
    	UnaryOperator<Integer> f = x -> x*x;
	    Scanner scan = new Scanner(System.in);
		System.out.println(f.power2(scan.nextInt())); 
    }
}
