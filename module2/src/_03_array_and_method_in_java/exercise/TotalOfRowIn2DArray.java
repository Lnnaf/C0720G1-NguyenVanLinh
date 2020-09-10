package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class TotalOfRowIn2DArray {
    public static void main(String[] args) {
        int length,width;
        int [][] matrix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        length = sc.nextInt();
        System.out.println("Enter width: ");
        width = sc.nextInt();
        matrix=inputArray(length,width);
        displayMatrix(matrix);
        total(matrix);
    }

    public static int[][] inputArray(int length,int width) {
        int[][] matrix;
        matrix= new int[length][width];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                System.out.println("Enter "+"["+i+"] "+"["+j+"]");
                matrix[i][j]=sc.nextInt();
            }
        }return matrix;
    }
    public static void displayMatrix(int[][]matrix) {
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
            }
        }
        System.out.println();
    }

    public static void total(int[][]matrix) {
        int row;
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row you want: ");
        row = sc.nextInt();
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
            }
            result += matrix[i][row];
            System.out.print(matrix[i][row]+"\t");
    }
        System.out.println("Result is: ");
        System.out.println(result);
}
}
