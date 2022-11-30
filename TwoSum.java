public class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *             <p>
     *             You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *             <p>
     *             You can return the answer in any order.
     *             Input: nums = [3,3], target = 6
     *             Output: [0,1]
     * @return
     * @author muhammetfeyzi
     */
    public static void main(String[] args) {
        int target = 6;
        int nums[] = {3,2,4};
        twoSum(nums,target).toString();
    }
    public static int[] twoSum(int[] nums, int target) {
        int remain = 0;
        if (nums.length >= 2 && nums.length <= 10000) {
            if(target<= Math.pow(10,9) && target >= Math.pow(-10,9) ){
            for (int i = 0; i < nums.length; i++) {
                remain = target - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == remain) {
                        System.out.println("i  " + i + " , " + " j " + j);
                        return new int[]{i, j};
                    }
                }
            }
        }
    }
        return null;
    }
}

