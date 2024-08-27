import java.util.*;
public class diagonaltransver{
    public int findDiagonalOrder(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        int m = 0;
        int n = 0;
        int ans[] = new int[m*n];
        int ind =0;
        boolean up = true;

        while(row<m && col<n){
            if(up== true){
                while(row > 0 && col < n-1){
                    ans[ind++] = matrix[row][col];
                    row--;
                    col++;

                }
                ans[ind++]=matrix[row][col];
                if(col == n-1 ){
                    row++;
                }else{
                    col++;}


            }//down
            else{
                while(row < m-1 && col >0 ){
                ans[ind++] = matrix[row][col];
                row++;
                col--;

            }
            ans[ind++]=matrix[row][col];
            if(row == m-1 ){
                col++;
            }else{
                row++;}


            }
            up =!up;

        }
        return ans;
        System.out.println();

    }
    static void printMatrix(int matrix[][]) {
        for (int m = 0; m < ROW; m++) {
            for (int n = 0; n < COL; n++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){

        int matrix[][] = { 
            { 1, 2, 3, 4 },     { 5, 6, 7, 8 }, 
            { 9, 10, 11, 12 },  { 13, 14, 15, 16 }, 
            { 17, 18, 19, 20 },};
        } 
        findDiagonalOrder(matrix);
        printMatrix(matrix);
        
    }
}
