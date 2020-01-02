package solutions;

// https://leetcode.com/problems/maximum-binary-tree/description/
public class MaximumBinaryTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }

    public TreeNode construct(int[] nums, int left, int right){
        if(left==right) return null;
        int maxIndex = max(nums,left,right);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = construct(nums, left, maxIndex);
        root.right = construct(nums,maxIndex+1,right);
        return  root;

    }

    public int max(int[] nums, int left, int right){
        int maxIndex = left;
        for (int i = left; left<=right;left++) {
            if(nums[left]<nums[i]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    public static void main(String[] args) {
        MaximumBinaryTree654 test = new MaximumBinaryTree654();
        test.constructMaximumBinaryTree(new int[]{1,2,3,4,5});
    }
}
