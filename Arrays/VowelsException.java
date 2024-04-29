class NoVowelsException extends Exception
{
    public NoVowelsException(String string)
    {
        super(string);
    }
}
class InputString
{
    public void InputData(String text)
    {
        char[] data = text.toCharArray();
        try 
        {
            for (char c : data)
            {
                if ("aeiouAEIOU".indexOf(c) != -1)
                throw new NoVowelsException("Vowels present in input data");
            }
            
        }
        catch(NoVowelsException e)
        {
            System.out.println(e);
        }
    }
}
public class VowelsException
{
    public static void main(String a[])
    {
        InputString obj = new InputString();
        obj.InputData("Hello");

    }
}