public class Main {
    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,0,1,1};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            totalSum += nums[i];
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(i != 0)
                leftSum += nums[i-1];
            if((totalSum - leftSum - nums[i]) == leftSum)
            {
                return i;
            }
        }
        return -1;
    }
}