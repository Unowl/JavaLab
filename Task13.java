import java.io.*;
public class Main
{
   public static void main(String[] args) throws IOException
   {
       String greetings = "Привет!";
        try(FileOutputStream output = new FileOutputStream("C:\\Users\\Public\\Documents"))
        {
            output.write(greetings.getBytes());
        }   
   }
}

