package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler authHandler = new AuthHandler();
        Handler validationHandler = new DataValidationHandler();
        Handler loggingHandler = new LoggingHandler();

        // Настройка цепочки
        authHandler.setNext(validationHandler).setNext(loggingHandler);

        // Проверка работы
        processRequest(authHandler, "auth"); // Авторизация пройдена
        processRequest(authHandler, "validate_data"); // Данные валидны
        processRequest(authHandler, "log"); // Логирование завершено
        processRequest(authHandler, "unknown"); // Нет обработчика для этого запроса
    }

    public static void processRequest(Handler handler, String request) {
        handler.handleRequest(request);
    }
}