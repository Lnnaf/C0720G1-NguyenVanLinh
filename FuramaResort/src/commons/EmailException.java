package commons;

public class EmailException extends Exception {
    public EmailException(String email) {
        super(email);
    }

    @Override
    public String getMessage() {
        return "Wrong format email" + super.getMessage();
    }
}
