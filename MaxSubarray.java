public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int result = maxSubArray(nums);
    
        System.out.println(result);
    
      }
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int i=1; i<nums.length;i++){
            sum = Math.max(nums[i],sum+nums[i]);
            max = Math.max(max,sum);
        }
        return max;
    
}
