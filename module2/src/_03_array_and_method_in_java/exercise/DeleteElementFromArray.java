package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] array;
        int x,index_del = 0;
        Scanner sc = new Scanner(System.in);
        array= new int[]{1,2,3,4,5,6};
        System.out.print("Enter x:");
        x=sc.nextInt();
        for(int i = 0;i<array.length;i++){
            if(x==array[i]){
                index_del=i;
                }
            }
        for(int k=index_del;k<array.length-1;k++){
            array[k]=array[k+1];

        }
        array[array.length-1]=0;
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
    }
}
