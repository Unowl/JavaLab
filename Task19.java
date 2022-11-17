
import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;


public class Task19
{
    public static void main(String[] args) {
        		Deque<Integer> queue = new LinkedList<>();
		Integer num;
 	    Scanner scan = new Scanner(System.in);
 	    String line = scan.nextLine();
 	    int l = 0;
 	    Scanner s = new Scanner(line);
 		while (s.hasNextInt()) 
 		{
 		     num = s.nextInt();
 		 	 queue.add(num);
 		 	 l++;
 		}
 	   
 	    for(int i = l; i >= 0; i-=2)
 	    {
 	    	System.out.println(queue.pollLast());
 	    	queue.pollLast();
 	    }
    }
}
