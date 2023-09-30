//Collection framework -- Treeset
//no duplicate elements are allowed
//increasing order while displaying the elements

import java.util.*;

public class L00TreeSet {

    public static void main(String[] args) {
        Set<Integer> hsh = new TreeSet<>();

        //add element
        hsh.add(10);
        hsh.add(10);
        hsh.add(5);
        hsh.add(20);
        hsh.add(30);
        hsh.add(40);
        hsh.add(50);
        hsh.add(60);

        //remove element 
        hsh.remove(5);

        //size of hash set
        System.out.println(hsh.size());

        Iterator<Integer> itr = hsh.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();
        
        //display linkedhashset
        System.out.println(hsh);
    }
    
}
