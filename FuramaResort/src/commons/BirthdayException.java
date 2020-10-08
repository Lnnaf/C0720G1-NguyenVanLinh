package commons;

public class BirthdayException extends Exception {
    public BirthdayException(String dayOfBirth){
        super(dayOfBirth);
    }

    @Override
    public String getMessage() {
        return "Wrong format day of birth or not enough 18 years old"+super.getMessage();
    }
}
