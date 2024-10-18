package ChainOfResponsibility;

public class AuthHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("auth")) {
            System.out.println("Авторизация пройдена");
        } else {
            super.handleRequest(request);
        }
    }
}
