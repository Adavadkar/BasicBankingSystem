
class OddNumberException extends Exception
{
    public OddNumberException(String string)
    {
        super(string);
    }
}
class Divisible
{
    public int divide(int a)
    {
        int result = 0;
        try
            {
                result = a%2;
                if(result != 0)
                throw new OddNumberException("Input number is not even");
            }
        catch(OddNumberException e)               
            {
                System.out.println("It not an even number"+""+e);
            }
        return result;
    }
}

public class LearningExceptions
{
    public static void main(String a[])
    {
        Divisible obj = new Divisible();
        int result = obj.divide(5);
        System.out.println(result);
    }
}


