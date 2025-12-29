class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
     List<Integer> luckyNumbers = new ArrayList<>();
        int m = matrix.length;     
        int n = matrix[0].length;   

        for (int i = 0; i < m; i++) {       
            int minVal = Integer.MAX_VALUE;
            int minCol = -1;

            for (int j = 0; j < n; j++) {   
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                    minCol = j;
                }
            }

          
            boolean isMax = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][minCol] > minVal) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                luckyNumbers.add(minVal);
            }
        }

        return luckyNumbers;
    }
}