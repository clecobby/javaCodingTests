import java.util.HashMap;

class TwoSum {
  public static void main(String[] args) {

    int target = 26;

    int[] nums = { 2, 7, 11, 15 };
    int[] result = twoSum(nums, target);

    System.out.println(result[0] + " " + result[1]);

    System.out.println("Hello world!");
  }

  public static int[] twoSum(int[] nums, int target) {
    // Create a new instance of the class
    // two sums to match target

    // return the index of the two numbers
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      
      map.put(nums[i], i);




    }
    return new int[] { -1, -1 }; // Return -1 if no solution found
  }

  //another algorithm

  public static int[] twopointer(int[] nums, int target){
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];
      if (sum == target) {
        return new int[] { left, right };
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return new int[] { -1, -1 };
}}