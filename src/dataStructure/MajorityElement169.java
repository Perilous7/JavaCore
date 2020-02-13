package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        int size = nums.length/2;
        for(int num: nums){
            if(map.containsKey(num)){
                map.replace(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int count=0;
        int key=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>count){
                count = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    public static void main(String[] args) {
        MajorityElement169 majorityElement169 = new MajorityElement169();
        System.out.println(majorityElement169.majorityElement(new int[]{3,2,3}));

    }
}
