class Solution {
    public void rev(int arr[], int st, int end) {
        int i = st, j = end;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] nums) {
        int dip = -1;
        int n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if ((nums[i] < nums[i + 1])) {
                dip = i;
                break;
            }
        }

        if (dip == -1) {
            rev(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[dip]) {
                int temp = nums[dip];
                nums[dip] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        rev(nums, dip + 1, n - 1);
    }
}