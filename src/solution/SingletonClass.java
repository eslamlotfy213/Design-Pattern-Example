package solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonClass {

    private String [] Letters = {"a","b","c","d"};
    private List<String> data = Arrays.asList(Letters);

    /*
     to create a SingletonClass Design pattern > create only on instance of an object
     1.create a private constractor
     2. create a private variable from class
     3. create a public method and initialize a instance
     */


    // 1.make constractor private
    // no need to add new()
     private SingletonClass()
     {
         Collections.shuffle(data);
     }

    // 2.create private instance of class
    private static SingletonClass instance;


    //3. create a getter from Instance
     public static SingletonClass getInstance() {
         if (instance ==null){
             instance = new SingletonClass();
         }
         return instance;
     }





    public void printData(){
         for (String item : data){
             System.out.printf(" "+ item);
         }
         System.out.println();
    }




}
