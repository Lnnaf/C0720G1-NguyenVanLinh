package _03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        int count=0;
        String str;
        char inputChar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        System.out.println("Enter character:");
        inputChar = sc.next().charAt(0);
        for(int i = 0; i <str.length();i++){
            if(inputChar == str.charAt(i)){
                count++;
            }
        }
        System.out.printf("Have %d character '%c' in %s",count,inputChar,str);
    }
}
