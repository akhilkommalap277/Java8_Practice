package Predicate;

/* Predicate - Functional Interface

Interface:

        public interface Predicate<T>

Method Details:

        boolean test(T t)

            Evaluates this predicate on the given argument.

        Parameters:

            t - the input argument

            Returns: true if the input argument matches the predicate, otherwise false

*/


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_Prime {

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            input.add(i);

        }
        eval(input,n-> n%2==0);
    }

    public static void eval(List<Integer> input, Predicate<Integer> predicate){

        for(int i:input){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }

    }



}
