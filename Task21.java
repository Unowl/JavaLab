import java.util.function.Function;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Task21
{
    static Boolean cond(Integer element)
	{
		if(element >= 3) return true;
		else return false;
	}
	
	static Boolean cond(String str)
	{
		if(str.equals("S1")) return true;
		else return false;
	}
    public static <T> void DeleteElement(ArrayList<T> array, Predicate<T> func)
	{
		for(int i = 0; i < array.size(); i++)
		{
			if(func.test(array.get(i)))
			{
				array.remove(i);
				i--;
			}		
		}
	}
    public static void main (String[] args) {
        
        ArrayList<Integer> arrayI = new ArrayList<>(5);
        for (int i = 0; i <= 5; i ++)
        {
		    arrayI.add(i);
        }
        
        System.out.println(arrayI);
        Predicate<Integer> func1 = a -> cond(a);
        DeleteElement(arrayI, func1);
		System.out.println(arrayI); 
		
		System.out.println("---------"); 
		
		ArrayList<String> arrayS = new ArrayList<>(3);
		arrayS.add("S1");
		arrayS.add("S1");
		arrayS.add("S2");
		
        System.out.println(arrayS); 
        
		Predicate<String> func2 = a -> cond(a);
		DeleteElement(arrayS, func2);
		System.out.println(arrayS); 
    }
}
