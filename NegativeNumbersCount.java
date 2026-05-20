public class NegativeNumbersCount {

    static void main(String[] args) {

    }

    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int result = 0;

        for(int i = 0 ; i < m; i++){
            int n = grid[i].length;

            for(int j = n - 1; j >= 0; j--){

                if(grid[i][j] < 0) result++;

            }
        }

        return result;
    }
}
