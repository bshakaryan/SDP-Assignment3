package Mediator;

public class SpecificAirplane extends Airplane {
    private String name;
    public SpecificAirplane(String name, AirTrafficController airTrafficController) {
        super(airTrafficController);
        this.name = name;
    }
    @Override
    public void send(String message) {
        System.out.println(name + " sends message: " + message);
        airTrafficController.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives message: " + message);
    }
}
