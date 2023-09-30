//collection framework -- Priority Queue
//by default "min value" is given priority 

import java.util.*;

public class L00PriorityQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> arr = new PriorityQueue<>();

        //add element
        arr.add(25);
        arr.add(5);
        arr.add(2);

        // //add element at certain index
        // arr.add(1, 10);

        // //replace element at certain index
        // arr.set(1, 5);

        // //get element at certain index
        // System.out.println(arr.get(0));  

        //element at first
        System.out.println(arr.peek());
        //remove element at certain index
        arr.remove();     

        System.out.println(arr);
        //size of the Priority Queue
        System.out.println("Size of Priority Queue: "+arr.size());

        sc.close();
    }
    
}
