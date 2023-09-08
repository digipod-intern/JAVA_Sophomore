public class logical {
    public static void main(String[] args){
        int a = 2;
        int b = 3;

        System.out.println((a>b)&&(a<b)); //False
        System.out.println(b>a||b<a); //True
        System.out.println(!(a>b)); //True
    }
}

/* AND Logical Operator: If any of the two condition is false then the output is false or we can say it gives output as true if and only if both the condition is true.
    * true && true = true
    * true && false = false
    * false && true = false
    * false && false = false 
*/

/* OR Logical Operator: If any one condition is true then the output is ture or we can say it will give false output if and only if both the output is false.
    * true || true = true
    * true || false = true
    * false || true = true
    * false || false = false
 */
 
/* NOT Logical Operator: It is used to reverse the logical state of its operand. If a condition is true then Logical NOT operator will make it false.
    * !true = false
    * !false = true
*/