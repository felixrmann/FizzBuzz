/**
 * @author Felix Mann
 * @version 1.0
 * @since 2020-August-25
 */

public class FizzBuzz {
    public static void main(String[] args) {

        //First try (alone)
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        //second try (with explenation)
        for (int i = 1; i < 100; i++) {
            String out = "";

            if (i % 3 == 0) out += "Fizz";
            if (i % 5 == 0) out += "Buzz";
            if (out.equals("")) out += i;

            System.out.println(out);
        }
    }
}
