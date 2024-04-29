@FunctionalInterface

interface Addition
{
    int add(int x, int y);
    
}
// class Sum
// {
//     public int add(int x, int y)
//     {
//         int result = x+y;
//         return result;
//     }
// }
public class LearningLambda
{
    public static void main(String a[])
    {
        Addition obj = (x,y) -> x+y;
        int result = obj.add(5,4);
        System.out.println("Sum of two numbers is:"+ result);
    }
}