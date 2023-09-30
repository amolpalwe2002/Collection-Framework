//collection framework -- Linked List
//it is also similar to arrayList but memory allocation is not contigous

import java.util.*;
import java.util.LinkedList;

public class L00LinkedList{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new LinkedList<>();

        //add element
        arr.add(5);
        arr.add(15);
        arr.add(25);

        //add element at certain position
        arr.add(1, 10);

        //replace element at certain position
        arr.set(1, 5);

        //get element at certain position
        System.out.println(arr.get(0));  

        //remove element at certain position
        arr.remove(0);     

        System.out.println(arr);
        //size of the linked list
        System.out.println("Size of Linked List: "+arr.size());

        sc.close();
    }
    
}
