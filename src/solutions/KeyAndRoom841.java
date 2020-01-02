package solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class KeyAndRoom841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(0);
        while (!stack.isEmpty()){
            int num = stack.pop();//get in the room
            for (Integer key:rooms.get(num)){//get the keys in the room
                if(!visited[key]){
                    visited[key]=true;
                    stack.push(key);//push rooms we are going to visit next
                }
            }
        }
        for(boolean success: visited){
            if(!success) {
                return false;
            }
        }
        return true;
    }
}
