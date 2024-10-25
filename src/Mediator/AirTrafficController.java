package Mediator;

public interface AirTrafficController {
    void registerAirplane(Airplane airplane);
    void sendMessage(String message, Airplane airplane);
}
