package dataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPlay {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("LOL");
        set.add("dota2");
        set.add("wow");
        Iterator<String> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
