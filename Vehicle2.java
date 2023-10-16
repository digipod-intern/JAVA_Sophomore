//Without object creation

public class Vehicle2 {
    public static void run() {
        System.out.println("Vehicle is running");
    }

    public static void stop() {
        System.out.println("Vehicle is stopped");
    }

    public static void reverse() {
        System.out.println("Vehicle is reversing");
    }

    public static void turn() {
        System.out.println("Vehicle is turning");
    }

    public static void park() {
        System.out.println("Vehicle is parked");
    }

    public static void honk() {
        System.out.println("Vehicle is honking");
    }

    public static void accelerate() {
        System.out.println("Vehicle is accelerating");
    }

    public static void decelerate() {
        System.out.println("Vehicle is decelerating");

    }

    public static void openDoor() {
        System.out.println("Vehicle door is opened");
    }

    public static void closeDoor() {
        System.out.println("Vehicle door is opened");
    }

    public static void main(String[] args) {
        openDoor();
        closeDoor();
        accelerate();
        run();
    }
}