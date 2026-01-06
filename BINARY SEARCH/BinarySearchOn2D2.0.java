// So here we need to check if the array is globally sorted.
// To check if the array is globally sorted then last element of a row < first element of next row.
// Case A: Globally sorted matrix
if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    return false;
}

int rows = matrix.length;
int cols = matrix[0].length;

int start = 0;
int end = rows * cols - 1;

while (start <= end) {
    int mid = start + (end - start) / 2;

    int r = mid / cols;   // row index
    int c = mid % cols;   // column index

    if (matrix[r][c] == target) {
        return true;
    } else if (matrix[r][c] < target) {
        start = mid + 1;
    } else {
        end = mid - 1;
    }
}
return false;
// We are pretending the matrix is a 1D sorted array
//  mid / cols → row
// mid % cols → column

