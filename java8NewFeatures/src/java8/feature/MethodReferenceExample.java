package java8.feature;

/**
 * Method Reference is a replacement of Lambda Expression. Mainly it is used for code re-usability.
 *
 * Whenever we have existing  Implementation of Abstract Method of our Functional Interface then
 * we can go for Method Reference. If no such method like testImplementation() is available then
 * go for Lambda Expression.
 */
public class MethodReferenceExample {
    public static void main(String[] args) {
        /**
         * By using the below Method reference we can re-use the same code again and again.
         */
        FunctionalInterfaceExample functionalInterfaceExample = MethodReferenceExampleTest :: testImplementation;
        functionalInterfaceExample.singleAbstMethod();

        /**
         * Everytime I have to write the same line of code whenever required.
         * We cannot use it again and again.
         *
         * If no testImplementation is available in existing code base then
         * have to use the following code  for lambda expression.
         */

        FunctionalInterfaceExample f = () -> System.out.println("IMPLEMENTATION of SAM");
        f.singleAbstMethod();
    }
}
