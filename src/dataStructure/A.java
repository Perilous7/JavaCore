package dataStructure;

public class A {
    public A(){};

    protected class B{
        public  void main(String[] args) {

        }
    }
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));

    }
}
