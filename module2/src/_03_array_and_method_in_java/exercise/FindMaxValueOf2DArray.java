package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class FindMaxValueOf2DArray {
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
        findMaxValue(matrix);


    }

    public static int[][] inputArray(int length,int width) {
        int[][] matrix= new int[length][width];
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
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void findMaxValue(int[][]matrix) {
        int max = 0;
        int iMax = 0, jMax=0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                if (matrix[i][j]>max){
                    max=matrix[i][j];
                    iMax=i;
                    jMax=j;
                }
            }
        }
        System.out.println("Max of Value is: "+max +" at "+ "["+iMax+"] "+"["+jMax+"]");
    }
}
