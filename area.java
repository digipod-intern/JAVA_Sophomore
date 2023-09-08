public class area {
    public static void main(String[] args) {
        int length = 10;
        int breadth = 20;

        int area_of_rectangle = length * breadth;
        System.out.println("Area of rectangle is: " + area_of_rectangle);

        int area_of_square = length * length;
        System.out.println("Area of square is: " + area_of_square);

        int area_of_triangle = (length * breadth) / 2;
        System.out.println("Area of triangle is: " + area_of_triangle);

        int height_of_cube = 10;
        int area_of_cube = 6 * (height_of_cube * height_of_cube);
        System.out.println("Area of cube is: " + area_of_cube);

        int area_of_cuboid = 2 * ((length * breadth) + (breadth * height_of_cube) + (height_of_cube * length));
        System.out.println("Area of cuboid is: " + area_of_cuboid);
    }
    
}
