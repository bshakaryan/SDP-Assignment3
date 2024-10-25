package Mediator;

public class Main {
    public static void main(String[] args) {
        AirTrafficController controller = new ConcreteAirTrafficController();

        Airplane airplane1 = new SpecificAirplane("Flight 101", controller);
        Airplane airplane2 = new SpecificAirplane("Flight 202", controller);
        Airplane airplane3 = new SpecificAirplane("Flight 303", controller);

        airplane1.send("Requesting permission to land.");
        airplane2.send("Requesting takeoff clearance.");
    }
}

