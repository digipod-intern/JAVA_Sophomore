//With object creation

public class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }

    public void stop() {
        System.out.println("Vehicle is stopped");
    }

    public void reverse() {
        System.out.println("Vehicle is reversing");
    }

    public void turn() {
        System.out.println("Vehicle is turning");
    }

    public void park() {
        System.out.println("Vehicle is parked");
    }

    public void honk() {
        System.out.println("Vehicle is honking");
    }

    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }

    public void decelerate() {
        System.out.println("Vehicle is decelerating");

    }

    public void openDoor() {
        System.out.println("Vehicle door is opened");
    }

    public void closeDoor() {
        System.out.println("Vehicle door is closed");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.openDoor();
        vehicle.closeDoor();
        vehicle.accelerate();
        vehicle.run();
    }
}
