
import java.util.Scanner;
public class Task7
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] words = s.split("\\.");
        String n = "Yes" ;
        for(String word : words){
            if(!(word.matches("^[0-9]+$"))) n = "No";
            if(n.equals("Yes") & (Integer.valueOf(word) > 256)) n = "No";
        }
        if(words.length !=4) n = "No";
        System.out.println(n);

}
}