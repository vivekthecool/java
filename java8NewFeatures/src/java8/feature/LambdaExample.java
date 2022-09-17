package java8.feature;

import java.util.Comparator;
import java.util.function.BiConsumer;
/**
 * Lambda Expression is an anonymous function (
 * without name, return type and access modifier and
 * having  one lambda (->) symbol)
 *
 * Functional Interface
 * Functional Interfaces are those interfaces which can have only one abstract method.
 * It can have any number of static methods, default methods.
 * There are many functional interfaces already available in java for example: Comparable, Runnable
*/
public class LambdaExample {
    public static void main(String[] args) {
        /**
         * Functional Interface - BiConsumer<Integer, Integer> biConsumer
         * Lambda Expression - (a, b) -> System.out.println(a + b)
         */
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a + b);
        biConsumer.accept(10, 15);

        /**
         * Functional Interface - Comparator<String> c
         * Lambda Expression - (s1, s2) -> s1.compareTo(s2)
         */
        Comparator<String> c = (s1, s2) -> s1.compareTo(s2);
    }
}
