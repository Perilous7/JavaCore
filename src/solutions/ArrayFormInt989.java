package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormInt989 {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList();
        int carry = K;
        int ALength = A.length;
        while (--ALength >= 0 || carry > 0) {
            if (ALength >= 0){
            carry += A[ALength];}
            ans.add(carry % 10);
            carry /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] testArray= {1,2,3,4,2,2};
        int k = 100;
        ArrayFormInt989 test = new ArrayFormInt989();
        System.out.println(test.addToArrayForm(testArray,k));
    }
}
