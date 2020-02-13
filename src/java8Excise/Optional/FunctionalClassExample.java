package java8Excise.Optional;

public class FunctionalClassExample implements FunctionalInterfaceExample {
    @Override
    public void doSomething() {
        System.out.println("Decorating with curtains");
    }


    public static void main(String[] args){
        FunctionalInterfaceExample fe = ()->{
            System.out.println("hello");
        };
        fe.doSomething();
        fe.saySomething();
        fe.saySomething1();

        FunctionalInterfaceExample fe2 = ()->{
            System.out.println("no way");
        };
        fe2.doSomething();

    }
}
