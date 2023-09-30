//collection framework -- Vector
//it is similar to arraylist but slower than arraylist
//array - fastest
//arraylist - faster
//vector - fast

import java.util.*;

public class L00Vector{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new Vector<>();

        //add element
        arr.add(5);
        arr.add(15);
        arr.add(25);

        //add element at certain index
        arr.add(1, 10);

        //replace element at certain index
        arr.set(1, 5);

        //get element at certain index
        System.out.println(arr.get(0));  

        //remove element at certain index
        arr.remove(0);     

        System.out.println(arr);
        //size of the vector
        System.out.println("Size of Vector: "+arr.size());

        sc.close();
    }
    
}
