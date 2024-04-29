 package ObjectOriented.Arrays;

// public class Consecutiveones 
// {
//     public static void main(String[] args) 
//     {
//         ReturnConsecutiveOnes obj = new ReturnConsecutiveOnes();
//         int[] nums = {1,1,1,0,0,1,1,1};
//         obj.findmaxconsecutiveones(nums);
//         int count = obj.findmaxconsecutiveones(nums);
//         System.out.println("Maximum number of consecutive ones are:" + count);
//     }
// }   
    
// class ReturnConsecutiveOnes
// {
//     public int findmaxconsecutiveones(int[] nums)
// {
//     int counter=0;
//     for (int i =1; i<=nums.length; i++)
//     {
//         Math.
//         if (nums[i] == 1 )
//         {
//             if ((i == 0 || nums[i - 1] != 1) && (i == nums.length - 1 || nums[i + 1] != 1))
//             {
//                 counter ++;
//             }
//         }
        
//     }
//     return counter;

// }

// }


public class Consecutiveones {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive ones: " + maxConsecutiveOnes);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0; // Reset count if the current number is 0
            }
        }

        return maxCount;
    }
}

