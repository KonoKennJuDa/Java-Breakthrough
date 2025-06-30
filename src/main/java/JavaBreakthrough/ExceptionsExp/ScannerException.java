package JavaBreakthrough.ExceptionsExp;

// Создали свой ScannerException и наследовали его от Exception
public class ScannerException extends Exception {

    // Мы переопределяем конструктор, который есть в родительском классе Exception
    public ScannerException(String description) {
        super(description); // super указывает на родителя
    }
}
