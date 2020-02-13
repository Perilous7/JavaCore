package dataStructure;

public class SingletonClass {
    private int number;
    private String someString;

    private static   SingletonClass singletonClass;

    private SingletonClass(){

    }

    public static SingletonClass getSingletonClass(){
        return new SingletonClass();
    }
}
