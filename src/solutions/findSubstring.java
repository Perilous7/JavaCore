package solutions;

import java.util.SortedSet;
import java.util.TreeSet;

public class findSubstring {

    public boolean checkSub(int a, int b, String str1, String str2) {
        boolean result = false;
        String longStr = a > b ? str1 : str2;
        String shortStr = a < b ? str1 : str2;

        result = reduceString(0,str2.length()-1,shortStr,longStr);
        return result;
    }

    public boolean reduceString(int leftIndex, int rightIndex, String str1, String str2) {
        //str1 short, short2 long
        if (str2.toString() == str1) {
            return true;
        }
        if (leftIndex + str1.length() > rightIndex) {
            return false;
        }
        for (int i = rightIndex; i >= 0; i--) {
            if (str1.charAt(str1.length()-1) == str2.charAt(i)) {
                rightIndex = i;
                str2 = str1.substring(leftIndex, i);
                break;
            }
            return false;
        }
        for (int j = 0; j < leftIndex; j++) {
            if (str1.charAt(0) == str2.charAt(j)) {
                leftIndex = j;
                str2 = str2.substring(j, rightIndex);
            }
            return false;

        }
        reduceString(leftIndex, rightIndex, str1, str2);
        return false;
    }




    public static void main(String[] args) {
        String string1 = "cd";
        String string2 = "dbbcd";

        findSubstring fs = new findSubstring();


        System.out.println(fs.reduceString(2,5,string1,string2));

        SortedSet<String> ss = new TreeSet();
    }
}
