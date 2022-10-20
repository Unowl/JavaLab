import java.util.ArrayList;
public class Task16
{
    public static void  NO_duplicat(Integer[] list){
       ArrayList <Integer> list2 = new ArrayList <Integer>();
	   for(int i = 0; i < list.length; i++)
	   {
		   if(!list2.contains(list[i]))
		   {
			   list2.add(list[i]);
			   System.out.println(list2.get(list2.size() - 1));
		   }	
	   }
    }
    public static void main(String[] args) {
        Integer[] a = {1,1,2,2,3,2,4,5};
        NO_duplicat(a);
	}
}