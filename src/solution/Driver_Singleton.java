package solution;

public class Driver_Singleton {


    public static void main(String[] args) {


        SingletonClass instance1 = SingletonClass.getInstance() ;
        SingletonClass instance2 = SingletonClass.getInstance() ;
        
        System.out.println(instance1.hashCode());
        instance1.printData();


        System.out.println(instance2.hashCode());
        instance2.printData();
    }
}
