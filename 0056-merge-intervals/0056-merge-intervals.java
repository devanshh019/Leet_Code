class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int top = 1;
        int n = intervals.length;
        int arr[] = new int[2 * n];
        arr[0] = intervals[0][0];
        arr[1] = intervals[0][1];

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= arr[top]) {
                arr[top] = Math.max(arr[top], intervals[i][1]);
            } else {
                top++;
                arr[top] = intervals[i][0];
                top++;
                arr[top] = intervals[i][1];
            }
        }

        int rows = (top + 1) / 2;
        int matrix[][] = new int[rows][2];
        int j = 0;
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = arr[j];
            j++;
            matrix[i][1] = arr[j];
            j++;

        }
        return matrix;
    }
}