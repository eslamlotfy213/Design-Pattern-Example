package problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SingletonClass {



    /*
     to create a SingletonClass Design pattern
     1.create a private constractor
     2. create a private variable from class
     3. create a public method and initialize a instance
     */



    private String [] Letters = {"a","b","c","d"};
    private List<String> data = Arrays.asList(Letters);



     public SingletonClass(){
         Collections.shuffle(data);
     }

    public void printData(){
         for (String item : data){
             System.out.printf(" "+ item);
         }

         System.out.println();

    }




}
