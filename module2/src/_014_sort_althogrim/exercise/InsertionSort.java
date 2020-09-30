package _014_sort_althogrim.exercise;

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = scanner.nextInt();
        int[] arrayNum = new int[size];
        System.out.println("Enter "+arrayNum.length + " values:");
        for (int index = 0; index<arrayNum.length; index++){
            arrayNum[index]=scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int index = 0; index < arrayNum.length; index++){
            System.out.print(arrayNum[index]+"\t");
        }
        insertSort(arrayNum);

    }

    public static void insertSort(int[] arrayNum){
        int index, insertValue, insertPosition;
        for(index =1; index < arrayNum.length; index++){
            insertValue = arrayNum[index];
            insertPosition = index;

            while (insertPosition > 0 && arrayNum[insertPosition - 1] > insertValue){
                arrayNum[insertPosition] = arrayNum[insertPosition - 1];
                insertPosition--;
                System.out.println("Di chuyen phan tu: "+arrayNum[insertPosition]);
            }
            if (insertPosition!=index){
                System.out.println("chen phan tu: "+insertValue+" tai vi tri: "+insertPosition);
                arrayNum[insertPosition] = insertValue;
            }
            System.out.println("vong lap thu: "+index);
            System.out.println(Arrays.toString(arrayNum));
        }
    }
}
