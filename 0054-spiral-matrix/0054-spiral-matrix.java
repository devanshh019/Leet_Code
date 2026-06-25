class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            //top
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            //right
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            //bottom
            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            //left
            if (right != left) {
                for (int i = bottom - 1; i >= top + 1; i--) {
                    list.add(matrix[i][left]);
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return list;

    }
}