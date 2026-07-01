class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int col_0=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    if(j==0){
                    col_0=0;
                    matrix[i][0]=0;
                    }
                    else{
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    }
                }
            }
        }

        for(int i=m-1;i>0;i--){
            for(int j=n-1;j>0;j--){
                if(j==0 && col_0==0){
                    matrix[i][j]=0;
                }
                else if(matrix[0][j]==0){
                    matrix[i][j]=0;
                }
                if(matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if(col_0==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
}