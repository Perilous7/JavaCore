package java8Excise.Optional;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    default void saySomething(){
        System.out.println("This is an default method1");
    }
    default void saySomething1(){
        System.out.println("This is an default method2");
    }

    void doSomething();


}

