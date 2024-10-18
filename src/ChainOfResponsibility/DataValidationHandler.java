package ChainOfResponsibility;

public class DataValidationHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("validate_data")) {
            System.out.println("Данные валидны");
        } else {
            super.handleRequest(request);
        }
    }
}