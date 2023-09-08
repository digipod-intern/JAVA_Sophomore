/* 
 * Conditionals in JAVA.
 * 1. if-else
 *  * Normal if-else: if-else
 *      Used when we have only two conditions.
 *  * Ladder if else: if-else-if-else
 *      Used when we have more than two conditions.
 *  * Nested if-else: if-else inside if-else
 *      Used when we have to check a condition inside a condition.
 * 2. switch-case
*/

public class Conditionals {
    public static void main(String[] args) {
        String mausam = "sunny";
        // Ladder if-else
        if (mausam == "sunny") {
            System.out.println("Let's go out for a walk.");
        } else if (mausam == "rainy") {
            System.out.println("Let's stay at home.");
        } else {
            System.out.println("Let's stay at home.");
        }
    }
}