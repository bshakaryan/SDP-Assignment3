package Mediator;

public abstract class Airplane {
    protected AirTrafficController airTrafficController;
    public Airplane (AirTrafficController airTrafficController) {
        this.airTrafficController = airTrafficController;
        airTrafficController.registerAirplane(this);
    }
    public abstract void send(String message);
    public abstract void receiveMessage(String message);
}
