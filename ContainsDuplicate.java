import java.util.HashSet;

public class ContainsDuplicate {    
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        boolean result = containsDuplicate(nums);
    
        System.out.println(result);
    
      }
    public static boolean containsDuplicate(int[] nums) {
        //create a hashset
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length;i++){
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    
}
