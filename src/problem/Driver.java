package problem;

public class Driver {


    public static void main(String[] args) {


        SingletonClass instance1 = new SingletonClass();
        SingletonClass instance2 = new SingletonClass();
        
        System.out.println(instance1.hashCode());
        instance1.printData();


        System.out.println(instance2.hashCode());
        instance2.printData();
    }
}
