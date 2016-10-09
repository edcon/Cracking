public class QuestionEight{

    public static void main(String[] args){
        int[][] matrix = {{1,2,0,4,5},{0,7,8,9,1},{3,2,1,5,6},{9,3,8,9,2}};
        System.out.printf("\n    Before \n--------------\n");
        printMatrix(matrix);
        System.out.printf("\n    After \n--------------\n");
        checkZeroes(matrix);
        printMatrix(matrix);


    }

    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                System.out.printf(" " + matrix[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }

    public static void checkZeroes(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i<row.length; i++){
            if(row[i] == true){
                clearRow(matrix, i);
            }
        }

        for(int j = 0;j<col.length;j++){
            if(col[j] == true){
                clearCol(matrix, j);
            }
        }
    }

    public static void clearRow(int[][] matrix, int row){
        for(int j=0; j<matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }

    public static void clearCol(int[][] matrix, int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }
}