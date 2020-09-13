package _03_array_and_method_in_java.practice;

import java.util.Scanner;

public class CountStudentsPassedExam {
    public static void main(String[] args) {
        int size, i=0, count= 0;;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter a size:");
            size = sc.nextInt();
            if(size > 30) {
                System.out.println("Limited 30");
            }
        }while(size >30);
        array = new int[size];
        while (i<array.length){
            System.out.println("Enter a mark for student "+(i+1)+": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("List of mark: ");
        for(int j = 0; j<array.length;j++){
            System.out.print(array[j]+"\t");
            if(array[j]>5 && array[j]<=10){
                count++;
            }
        }
        System.out.println("the number of student passed this exam is: "+count);
    }

}
