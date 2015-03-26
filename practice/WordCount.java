import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Write a description of class WordCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordCount
{
    /**
     * Default constructor for objects of class WordCount
     */
    public static void main(String args[])
    {
        Scanner fi = new Scanner(System.in);
        boolean runs = true;
        int words = 0;
        int characters = 0;
        do{
            System.out.println("Enter the file name: ");
            String name = fi.next();
            File inputFile = new File(name);
            try
            {
                Scanner in = new Scanner(inputFile);
                while (in.hasNext())
                {
                    in.next();
                    words++;
                }
                //while(in.hasNextChar())
                //{
                //    in.nextChar();
                //    characters++;
                        
                //}
            }
            catch(IOException io)
            {
                System.out.println("Error could not find file");
                runs = false;
            }
        }
        while(runs == false);        
    }
}


