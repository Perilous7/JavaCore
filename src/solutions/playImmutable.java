package solutions;

import java.math.BigInteger;

public class playImmutable {
    public static void main(String[] args) {
        String s = "abc";
        s = s.toUpperCase();
        System.out.println(s);

        BigInteger b= new BigInteger("1000");
        b= b.add(new BigInteger("2"));
        System.out.println(b);
    }
}
