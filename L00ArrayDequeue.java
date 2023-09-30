//collection framework -- ArrayDequeue
//Open ended queue
//insertion and deletion takes place from both the ends

import java.util.*;

public class L00ArrayDequeue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> arr = new ArrayDeque<>();

        //add element
        arr.addFirst(10);
        arr.addFirst(5);
        arr.addLast(15);
        arr.addLast(25);

        // //add element at certain index
        // arr.add(1, 10);

        // //replace element at certain index
        // arr.set(1, 5);

        // //get element at certain index
        // System.out.println(arr.get(0));  

        //element at first
        System.out.println(arr.peek());
        //remove element from first
        arr.removeFirst();   
        //remove element from Last
        arr.removeLast();     

        System.out.println(arr);
        //size of the ArrayDeque
        System.out.println("Size of ArrayDeque: "+arr.size());

        sc.close();
    }
    
}
