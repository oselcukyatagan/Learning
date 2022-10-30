package newPack;

import java.util.Scanner;

public class gauss {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in); //Matrix creation dimensions
        System.out.print("Number of rows: ");
        int rows = scan.nextInt();
        System.out.print("Number of coloumns: ");
        int cols = scan.nextInt();

        Double [][] matrix = new Double[rows][cols];
        String instruct = String.format("Write %d numbers: ", (rows * cols)); //User input for matrix
        System.out.print(instruct);

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                                                    //Matrix creation
                double x = scan.nextInt();
                matrix[i][j] = x;
            }
        }

        for(int kekw = 0; kekw < rows; kekw++) {        //Make the first element 1
            if (matrix[0][0] != 0) {
                matrix[0][kekw] *= (1 / matrix[0][0]);
            }
        }



        /*
        else{
            }
         */

        for(int printMatrix = 0; printMatrix < matrix.length; printMatrix++) {
            System.out.println();
            for(int printMatrixY = 0; printMatrixY < matrix.length; printMatrixY++) {
                System.out.print(matrix[printMatrix][printMatrixY] + " ");
            }
        }


    }
}