package Mediator;

import java.util.*;

public class ConcreteAirTrafficController implements AirTrafficController {
    private List <Airplane> airplanes = new ArrayList<>();
    @Override
    public void registerAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public void sendMessage(String message, Airplane sender) {
        for (Airplane it : airplanes) {
            if (it != sender) {
                it.receiveMessage(message);
            }
        }
    }
}
