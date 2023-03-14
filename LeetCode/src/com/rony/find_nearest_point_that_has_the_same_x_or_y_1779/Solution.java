package com.rony.find_nearest_point_that_has_the_same_x_or_y_1779;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.nearestValidPoint(3,4,new int[][] {{1,2},{3,1},{2,4},{2,3},{4,4}}));
    }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist =  Integer.MAX_VALUE;
        int minIdx = -1;
        for(int i=0; i<points.length; i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            if( x1 == x || y1 == y){
                int manhattanDist = Math.abs(x-x1)+Math.abs(y-y1);
                if(manhattanDist < minDist){
                    minDist = manhattanDist;
                    minIdx = i;
                }
            }

        }
        return minIdx;
    }

}
