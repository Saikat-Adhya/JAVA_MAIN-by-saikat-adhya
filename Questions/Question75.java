public class Question75 {
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = -1; ans[1] = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int ans[] = twoSum(nums, target); // Call the static method directly
        System.out.println("The indices are " + ans[0] + " and " + ans[1]);
    }
}
