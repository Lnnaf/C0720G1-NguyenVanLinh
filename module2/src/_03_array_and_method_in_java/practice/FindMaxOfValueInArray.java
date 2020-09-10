package _03_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindMaxOfValueInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter size: ");
            size  = sc.nextInt();
            if(size>20){
                System.out.println("limited 20");
            }
            array = new int[size];
            int i = 0;
            while(i<array.length){
                System.out.println("Enter Element "+(i+1)+" :");
                array[i]=sc.nextInt();
                i++;
            }
            System.out.println("Property list: ");
            for(int j = 0; j< array.length; j++){
                System.out.print(array[j]+"\t");
            }
            int max= array[0];
            int index= 1;
            for(int j = 0;j<array.length;j++){
                if(array[j]>max){
                    max = array[j];
                    index = j+1;
                }
            }
            System.out.println("");
            System.out.println("Result: "+max+" at position: "+index);
        }while (size>20);
    }
}
