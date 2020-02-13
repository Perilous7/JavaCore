package dataStructure;

public class Fibonacci {
    public int fiboCalc(int num){
        if(num==1 || num==2){
            return 1;
        }
        return fiboCalc(num-1)+fiboCalc(num-2);
    }
    public static void main(String[] args) {
        Fibonacci test= new Fibonacci();
        System.out.println(test.fiboCalc(4));
    }
}
