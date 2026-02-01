class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     /*
        left             right     
         1       2         3       top
         4       5         6
         7       8         9       bottom
       To print the matrix first  we have to move from left to right to print the top row and then top to bottom and then right to left and then bottom to top this is the movement of the whole matrix 
*/
List<Integer> list  = new ArrayList<>();
if (matrix == null || matrix.length == 0) return list;
int left = 0 , right  = matrix[0].length-1;
int top =0 , bottom = matrix.length-1;
while(top <=bottom && left<=right){
    //top row 
    for(int i =left; i<= right ; i++){
        list.add(matrix[top][i]);
    }
        top++;
    
    // right col
    for(int i= top; i<=bottom; i++){
        list.add(matrix[i][right]);
    }
        right--;
    
    //bottom row 
    if(top<=bottom){
        for(int i = right; i>=left;i--){
            list.add(matrix[bottom][i]);
        }
            bottom--;
        }
    if(left<=right){
        for(int i= bottom ; i>=top; i--){
            list.add(matrix[i][left]);
        }
            left++;
        }
    }

return list;
    }
    }
