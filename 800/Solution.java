
public class Solution {
    int[][] arr;
    int row;
    int col;
    public int Count(int[][] matrix) {
        // code here
        this.arr = matrix;
        row = matrix.length;
        col = matrix[0].length;
        
        int result = 0;
        
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                
                if(matrix[i][j] == 1 && counter(i, j) != 0 && (counter(i, j) % 2 == 0)) result++;
            }
        }
        
        return result;
    }
    
    private int counter (int i, int j){
        
        int count = 0;
        
        if (i > 0 && j > 0 ) if (arr[i - 1][j - 1] == 0) count++;
        if ( i < row - 1 && j < col - 1) if (arr[i + 1][j + 1] == 0) count++;
        
        if (i > 0) if (arr[i - 1][j] == 0) count++;
        if (j > 0) if (arr[i][j - 1] == 0) count++;
        if (i < row - 1) if (arr[i + 1][j] == 0) count++;
        if (j < col - 1) if (arr[i][j + 1] == 0) count++;
        
        if (i > 0 && j < col - 1) if (arr[i - 1][j + 1] == 0) count++;
        if (i < row - 1 && j > 0 ) if (arr[ i -1][j + 1] == 0) count++;
        
        return count;
    }
}

