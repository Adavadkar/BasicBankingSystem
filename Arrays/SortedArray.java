package ObjectOriented.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedArray 
{
    public static void main(String[] args)
    {
        ReturnSortedArray obj = new ReturnSortedArray();
        int[] nums = {4, 6, 7, 8, 9};
        int[] sortedArray = obj.SortedArray(nums);
        System.out.println("Square root of sorted array is:" + Arrays.toString(sortedArray));
    }
}
class ReturnSortedArray
{
    public static int[] SortedArray(int[] nums)
    {
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++)
        {
            
             result[i] = nums[i]*nums[i];


        }
        Arrays.sort(result);
        return result;

    }
}