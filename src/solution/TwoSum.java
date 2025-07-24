package solution;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    sums[0] = i;
                    sums[1] = j;
                    break;
                }
            }
        }

        return sums;
    }
}
