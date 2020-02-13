package dataStructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
    //Student.testHashMap();

   // Student.testTreeMap();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);

        List<List<Integer>> l3 = new ArrayList<>();
        l3.add(l1);
        l3.add(l2);

        l3 = l3.stream().map(e->e.stream().map(i->i+1).collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(l3);
        //l3.stream().forEach(e->List.);
        System.out.println(l3.stream());

 }
}

