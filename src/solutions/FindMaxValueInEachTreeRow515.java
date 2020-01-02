package solutions;

import java.util.*;

public class FindMaxValueInEachTreeRow515 {

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        queue.offer(root);
        ans.add(root.val);
        while (!queue.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    tempList.add(node.left.val);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    tempList.add(node.right.val);
                }
            }
            if(!tempList.isEmpty()){
                ans.add(Collections.max(tempList));
            }
        }
        return ans;

    }
    public static void main (String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(3);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(3);
        TreeNode root5 = new TreeNode(9);


        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.right = root5;

        FindMaxValueInEachTreeRow515 test = new FindMaxValueInEachTreeRow515();
        System.out.println(test.largestValues(root));
    }
}

