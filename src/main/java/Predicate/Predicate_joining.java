package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_joining {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            input.add(i);

        }

        Predicate<Integer> p1= i-> i>3;
        Predicate<Integer> p2= i-> i%2==0;

        eval(input,p1);
        eval(input,p2);

        eval(input,p1.negate());
        eval(input,p1.or(p2));
        eval(input,p1.and(p2));


    }

    public static void eval(List<Integer> input,Predicate<Integer> predicate){

        for(int i:input){
            if(predicate.test(i)){
                System.out.println(i);
            }
        }

    }

}
