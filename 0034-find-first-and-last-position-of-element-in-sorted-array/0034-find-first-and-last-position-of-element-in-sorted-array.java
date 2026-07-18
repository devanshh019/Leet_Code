class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOcc(nums, target), lastOcc(nums, target)};
    }

    private int firstOcc(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                h = mid - 1; // keep searching left
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    private int lastOcc(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                ans = mid;
                l = mid + 1; // keep searching right
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}