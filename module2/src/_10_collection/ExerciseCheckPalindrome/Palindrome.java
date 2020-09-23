package _09_Collection.ExerciseCheckPalindrome;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        check();

    }
    static void check(){
        Stack stackBegin = new Stack();
        Queue queue = new LinkedList();
        String[] string = "Able was I ere I saw Elba".toLowerCase().split("");
        for(int index=0;index <string.length;index++){
            stackBegin.push(string[index]);
        }
        for(int index=0;index <string.length;index++){
            queue.offer(string[index]);
        }
        while (!stackBegin.isEmpty()){
            Object a = stackBegin.pop();
            Object b = queue.poll();
            if(a==b){
                System.out.print("ok");
            }else {
                System.out.print(b+"\t");
            }
        }
    }
}
