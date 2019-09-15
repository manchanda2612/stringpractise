package sample.com.practise;

import java.util.ArrayList;

public class PractiseLambdaExpress {

    /**
     * Anonymous inner class using lambda expression
     */
    Sample.PrintInterface s1 = () -> {
        System.out.println("Lambda Expression called");
    };


    /**
     * Iterate Collection using lambda expression
     */
    public void iterateListWithsLambda() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Joginder");
        list.add("Bhawna");
        list.add("Ravinder");

        list.forEach(a -> System.out.println(a));

    }




}
