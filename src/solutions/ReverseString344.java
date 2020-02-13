package solutions;

public class ReverseString344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }

    public static void main(String[] args){
        char[] arr  ={'h','e','l','l','o'};
        ReverseString344 test = new ReverseString344();
        test.reverseString(arr);
    }
}
