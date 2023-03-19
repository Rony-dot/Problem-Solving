package com.rony.check_if_it_is_a_straight_line_1232_easy;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkStraightLine(new int[][]{{2,1},{4,2},{6,3}}));
        System.out.println(solution.checkStraightLine(new int[][]{{1,2},{2,3},{3,5}}));
        System.out.println(solution.checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
        System.out.println(solution.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
    }
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if(n==1 || n==2) return true;
        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[1][0];
        double y2 = coordinates[1][1];
        double slope;
        if(x2-x1 == 0) slope = -9999;
        else slope = (y2-y1)/(x2-x1);
        for(int i=1; i<n-1; i++){
            x1 = coordinates[i][0];
            y1 = coordinates[i][1];
            x2 = coordinates[i+1][0];
            y2 = coordinates[i+1][1];
            double m;
            if(x2-x1 == 0) m = -9999;
            else m =  (y2-y1)/(x2-x1);
            if(m!=slope) return false;
        }
        return true;
    }

}
