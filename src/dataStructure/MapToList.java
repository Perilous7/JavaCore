package dataStructure;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToList {
    public static void main(String[] args) {

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("RYO",37);
        map1.put("Han",29);
        map1.put("Humble",28);
        map1.put("Ray",29);

        //Question 1
        //return keys in map
        System.out.println(map1.keySet());



        //Question 2
        // get duplicate element in map to array
        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)));
        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)).
                entrySet().stream().filter(e->e.getValue().size()>1).collect(Collectors.toList()));
        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)).
                entrySet().stream().filter(e->e.getValue().size()>1).map(e->e.getValue()).collect(Collectors.toList()));

        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)).
                entrySet().stream().filter(e->e.getValue().size()>1).map(e->e.getValue()).map(e->e.get(0).getKey()).collect(Collectors.toList()));

        System.out.println(map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue)).
                entrySet().stream().filter(e->e.getValue().size()>1).map(e->e.getValue()).flatMap(List::stream).map(e->e.getKey()).collect(Collectors.toList()));


        //Question 3
        List<String> l = new ArrayList<>();
        l.add("RYO");
        l.add("Han");
        l.add("Humble");
        l.add("Ray");
        System.out.println("\nOriginal list is "+l);
        System.out.println("Converting to "+l.stream().collect(Collectors.toMap(e->e,e->1)));




    }
}
