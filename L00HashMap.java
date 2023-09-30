//Collection framework -- HashMap
//no duplicates allowed
//seperate from collection framework

import java.util.*;

public class L00HashMap {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();

        //add elements
        hm.put('A', 10);
        hm.put('B', 20);
        hm.put('C', 30);
        hm.put('D', 40);

        //get elements
        System.out.println(hm.get('A'));

        //remove element
        hm.remove('D');

        //size of hashMap
        System.out.println(hm.size());

        System.out.println(hm);
        

    }
    
}
