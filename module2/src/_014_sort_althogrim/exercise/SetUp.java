package _014_sort_althogrim.exercise;

import java.util.Scanner;

public class SetUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your list size:");
        int size = sc.nextInt();
        int[] arrayNum = new int[size];
        System.out.println("Enter "+arrayNum.length + " values:");
        for (int index = 0; index<arrayNum.length; index++){
            arrayNum[index]=sc.nextInt();
        }
        System.out.println("Your input list:");
        display(arrayNum);
        insertSort(arrayNum);
        System.out.println("");
        System.out.println("Sorted: ");
        display(arrayNum);
    }
    public static void insertSort(int [] arrayNum){
        int index, insertValue, insertPosition;
        for(index =1; index < arrayNum.length; index++){
            insertValue = arrayNum[index];
            insertPosition = index;

            while (insertPosition > 0 && arrayNum[insertPosition - 1] > insertValue){
                arrayNum[insertPosition] = arrayNum[insertPosition - 1];
                insertPosition--;
            }
            if (insertPosition!=index){
                arrayNum[insertPosition] = insertValue;
            }
        }
    }
    public static void display(int [] arrayNum){
        for (int index = 0; index < arrayNum.length; index++){
            System.out.print(arrayNum[index]+"\t");
        }
    }
}
