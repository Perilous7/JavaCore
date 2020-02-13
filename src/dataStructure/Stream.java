package dataStructure;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("l");
        l.add("lol");
        l.add("lol");
        l.add("true");

        Object[] oa= l.stream().filter(e->e.length()>1).toArray();
        for (Object e:oa){
            System.out.println(e);
        }
        l.stream().forEach(System.out::println);
        l.stream().forEach(e->{
            System.out.println(e.getBytes());
        });
        Comparator<String> c = (e1,e2)-> e1.length()-e2.length();
        System.out.println(l.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Any match "+l.stream().anyMatch(e->e.equalsIgnoreCase("lolo")));

        System.out.println("All match "+l.stream().allMatch(e->e.length()>=1));

        System.out.println("Any match "+l.stream().collect(Collectors.toCollection(TreeSet::new)));
    }

}
