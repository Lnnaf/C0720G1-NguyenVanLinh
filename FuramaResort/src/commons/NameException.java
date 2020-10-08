package commons;

public class NameException extends Exception{
    public NameException (String message){
        super(message);
        }

    @Override
    public String getMessage() {
        return "Wrong format name, Example: 'Nguyen Van Linh' " +super.getMessage();
    }
}

