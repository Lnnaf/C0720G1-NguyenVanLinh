package _10_collection.ExerciseCheckPalindrome;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        if(check()){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }

    }
    static boolean check(){
        Scanner scanner = new Scanner(System.in);
        Stack stackBegin = new Stack();
        Queue queue = new LinkedList();
        System.out.println("enter string: ");
        String string = scanner.nextLine().toLowerCase().trim();
        for(int index=0;index <string.length();index++){
            stackBegin.push(string.charAt(index));
        }
        for(int index=0;index <string.length();index++){
            queue.add(string.charAt(index));
        }
//        while(!stackBegin.isEmpty()){
//            stackSecond.push(stackBegin.pop());
//        }
        System.out.println(stackBegin);
        System.out.println(queue);
        boolean check = false;
        while (!stackBegin.isEmpty()){
            if((stackBegin.pop()==queue.poll())){
//                System.out.println("ok");
                check = true;
            }else {
//                System.out.println("try");
                check = false;
                break;
            }
        }
            return check;
    }
}
