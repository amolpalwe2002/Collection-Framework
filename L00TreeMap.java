//Collection framework -- TreeMap
//no duplicates allowed
//seperate from collection framework
//only displayed in increasing order

import java.util.*;

public class L00TreeMap {
    public static void main(String[] args) {
        Map<Character,Integer> hm = new TreeMap<>();

        //add elements
       
        hm.put('C', 30);
        hm.put('D', 40);
        hm.put('A', 10);
        hm.put('B', 20);

        //get elements
        System.out.println(hm.get('A'));

        //remove element
        hm.remove('D');

        //size of hashMap
        System.out.println(hm.size());

        System.out.println(hm);
        

    }
    
}
