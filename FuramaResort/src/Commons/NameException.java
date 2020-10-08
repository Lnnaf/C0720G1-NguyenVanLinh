package Commons;

public class NameException extends Exception{
    public NameException (String message){
        super(message);
        }

    @Override
    public String getMessage() {
        return "error"+super.getMessage();
    }
}

