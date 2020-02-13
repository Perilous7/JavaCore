package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
//#wrong
public class AlmostIncreasingSequence {
    boolean almostIncreasingSequence(int[] sequence) {
        ArrayList<Integer> list = Arrays.stream(sequence).boxed().collect(Collectors.toCollection(ArrayList::new));
        for(int i =0;i<list.size();i++){
            list.remove(i);
            ArrayList<Integer> newList = new ArrayList<>(list);
            Collections.sort(newList);
            if(newList == newList) {
                System.out.println(list);
                System.out.println(newList);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        System.out.println(almostIncreasingSequence.almostIncreasingSequence(new int[] {1,3,2,1}));
    }

}
