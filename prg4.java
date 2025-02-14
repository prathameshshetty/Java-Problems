import java.io.File;
import java.util.Scanner;
public class prg4 {
    public static void main(String args[])
    {
        try{

            File file=new File("test1.txt");
            file.createNewFile();
            if(!file.exists())
            {
                System.out.println("File dose'nt exist");
                return;
            }

            Scanner scanner=new Scanner(file);

            if(!scanner.hasNextLine())
            {
                scanner.close();

                throw new Exception("Error: File is empty!!");
            }
        }catch(Exception e)
        {
System.out.println(e.getMessage());
        }
    }
}
