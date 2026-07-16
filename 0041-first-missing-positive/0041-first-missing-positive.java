class Solution {

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length, i = 0;

        while (i < n) {
            if (nums[i] > 0 &&
                    nums[i] <= n &&
                    nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for (int x = 0; x < n; x++) {
            if (nums[x] - 1 != x) {
                return x + 1;
            }
        }

        return n + 1;
    }
}