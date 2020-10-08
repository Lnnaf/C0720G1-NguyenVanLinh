package commons;

public class IDCardException extends Exception{
    public IDCardException(String idCard){
        super(idCard);
    }

    @Override
    public String getMessage() {
        return "Wrong format ID Card"+super.getMessage();
    }
}
