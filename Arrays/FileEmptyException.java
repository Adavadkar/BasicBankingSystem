import java.util.*;
public class FileEmptyException 
{
    public static void main(String[] args)
    {
        try
        {
            List<String> filereader = readsFromFile();
            checksEmptyFiles(String);

            
        }
        catch(EmptyFileException e)
        {
            System.out.println(e);
        }
        
    }

    public List<String> readsFromFile()
    {
        List <String> filereader = new ArrayList<>();
        Scanner sc = new Scanner("C:\Users\Aditi\Documents\QA_Cover_letter.docx");

    }
    public static void checksEmptyFiles()
    {
        
    }
     
}
