public class PasswordMisMatchException extends RuntimeException{
    public PasswordMisMatchException() {
    }

    public PasswordMisMatchException(String message) {
        super(message);
    }
}
