
import java.util.function.Function;
import java.util.Scanner;
import java.util.ArrayList;

public class Task21
{
        static class DeleteElement<T> implements Function<T, ArrayList<T>> 
        {	
            ArrayList<T> array;
            DeleteElement(ArrayList<T> array)
            {
        	    this.array = array;
            }
            
            @Override
            public ArrayList<T> apply(T element) 
            {
        	    for(int i = 0; i < array.size(); i++)
        	    {
        		    if(array.get(i) == element) 
        		    {
        			    array.remove(i);
        			    i--;
        		    } 
        	    }
                return array;
            }
            
        }
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayI = new ArrayList<>(5);
        for (int i = 0; i <= 5; i++)
        {
		    arrayI.add(i);
        }
        
        System.out.println(arrayI);
        
		DeleteElement<Integer> testI = new DeleteElement<>(arrayI);
		testI.apply(2);
		System.out.println(testI.array); 
		
		System.out.println("---------"); 
		
		ArrayList<String> arrayS = new ArrayList<>(3);
		arrayS.add("S1");
		arrayS.add("S2");
		arrayS.add("S2");
		
        System.out.println(arrayS); 
        
		DeleteElement<String> testS = new DeleteElement<>(arrayS);
		testS.apply("S2");
		System.out.println(testS.array); 
    }
}
