package com.rony.rotate_image_48;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[][] {{1,2,3,},{4,5,6},{7,8,9}});
    }
    public void rotate(int[][] matrix) {
        int colSize = matrix.length;
        int rowSize = matrix[0].length;
        int[][] copy = new int [rowSize][colSize];
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                copy[i][j] = matrix[i][j];
            }
        }
        int tata = colSize;
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                matrix[j][tata-1] = copy[i][j];
            }
            tata--;
        }
    }

}
