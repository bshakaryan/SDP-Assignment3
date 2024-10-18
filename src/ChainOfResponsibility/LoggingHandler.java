package ChainOfResponsibility;

public class LoggingHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("log")) {
            System.out.println("Логирование завершено");
        } else {
            super.handleRequest(request);
        }
    }
}
