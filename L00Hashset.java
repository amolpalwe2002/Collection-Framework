//Collection framework -- Hashset
//no duplicate elements are allowed
//order might be different while displaying

import java.util.HashSet;
import java.util.*;

public class L00Hashset {

    public static void main(String[] args) {
        HashSet<Integer> hsh = new HashSet<>();

        //add element
        hsh.add(10);
        hsh.add(10);
        hsh.add(5);
        hsh.add(20);

        //remove element 
        hsh.remove(5);

        //size of hash set
        System.out.println(hsh.size());

        Iterator<Integer> itr = hsh.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        
        //display hashset
        System.out.println(hsh);
    }
    
}
