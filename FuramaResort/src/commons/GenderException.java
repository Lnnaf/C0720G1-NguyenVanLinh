package commons;

public class GenderException extends Exception {
    public GenderException(String gender) {
        super(gender);
    }

    @Override
    public String getMessage() {
        return "Wrong format Gender" + super.getMessage();
    }
}
