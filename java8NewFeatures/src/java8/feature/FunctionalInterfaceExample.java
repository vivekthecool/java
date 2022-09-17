package java8.feature;

/**
 * Functional Interface is an interface with Exactly One Single Abstract method
 * and can have multiple default and static methods.
 *
 * To Create a Functional Interface:
 * 1. Create an Interface
 * 2. Annotate that  with @FunctionalInterface
 * 3. Define Exactly one Abstract method
 * 4. There is no limitation on default & static methods defined in such and Interface
 *
 * Java can implicitly identify functional interface but still we can also annotate with
 * @FunctionalInterface. It just gives the security that in case if by-mistake we add more that
 * one Abstract methods then Compiler will throw Compile Time Error.
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {

    void singleAbstMethod();

//    void singleAbstMethod1();

    default void printName() {
        System.out.println("hello...");
    }

    default void printName2() {
        System.out.println("hello...");
    }
}
