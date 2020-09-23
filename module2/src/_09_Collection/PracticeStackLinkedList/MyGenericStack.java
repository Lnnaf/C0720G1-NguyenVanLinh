package _09_Collection.PracticeStackLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack push operation: "+ stack.size());
        System.out.println("1.2. Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("3.3. Size of stack after pop operations: "+ stack.size());
    }
    public static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operation" + stack.size());
        System.out.println("2.2. Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("3.3.  Size of stack after pop operation: "+stack.size());
    }
    public static class GenericStackClient{
        public static void main(String[] args) {
            System.out.println("1. Stack of Integer ");
            stackOfInteger();
            System.out.println("2.Stack of String ");
            stackOfIStrings();
        }
    }
}




