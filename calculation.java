public class calculation {
    public static void main(String[] args) {
        //calculate the exponetial of any number
        // 2^100
        int base = 3;
        int power = 3;

        //To calculate the exponential
        int expo = (int) Math.pow(base, power);
        expo = base * base * base;
        System.out.println(expo);
        
        //To calculate the square root
        int num = 36;
        int sqrt = (int) Math.pow(num, 0.5);
        sqrt = (int) Math.sqrt(num);
        System.out.println(sqrt);

        System.out.println(Math.pow(base, power));

        //To calculate the cube root
        int cube = (int) Math.pow(num, 1.0/3);
        System.out.println(cube);

        //To calculate the absolute value
        int a = -10;
        int abs = Math.abs(a);
        System.out.println(abs);

        //To calculate the maximum value
        int b = 10; 
        int max = Math.max(a, b);
        System.out.println(max);

        //To calculate the minimum value
        int min = Math.min(a, b);
        System.out.println(min);
        
        //To calculate the round value
        float c = 10.5f;
        float round = Math.round(c);
        System.out.println(round);

        //To calculate the floor value
        float floor = (float) Math.floor(c);
        System.out.println(floor);

        //To calculate the ceil value
        float ceil = (float) Math.ceil(c);
        System.out.println(ceil);

        //To calculate the random value
        double random = Math.random();
        System.out.println(random);
    }
}
/* 
 * Implicit Type Casting:
    * Automatic Type Casting
    * int a = 3;
    * float b = a;
 * Explicit Type Casting:
    * Manual Type Casting
    * float a = 3.14f;
    * int b = (int) a;
*/