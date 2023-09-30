//collection framework -- Stack

import java.util.*;
import java.util.Stack;

public class L00Stack{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> arr = new Stack<>();

        //add element
        arr.push(5);
        arr.push(15);
        arr.push(25);

        // //add element at certain position
        // arr.add(1, 10);

        // //replace element at certain position
        // arr.set(1, 5);

        //get element at certain position
        // System.out.println(arr.get(0));  

        //remove element 
        arr.pop();     

        //top element in the stack
        System.out.println(arr.peek());

        System.out.println(arr);
        //size of the stack
        System.out.println("Size of Stack: "+arr.size());

        sc.close();
    }
    
}
