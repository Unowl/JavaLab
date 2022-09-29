
import java.util.Scanner;
public class Task6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.split(" ");
        int n = 0 ;
        for(String word : words){
            if(word.matches("^[a-zA-Z]+$")) n++;
        }
        System.out.println(n);

}
}