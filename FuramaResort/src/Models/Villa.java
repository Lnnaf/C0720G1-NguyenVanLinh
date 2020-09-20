package Models;

public class Villa extends Service {
    public Villa(String id) {
        super(id);
    }

    @Override
    void showInfor() {
        System.out.println(id+". "+"this is villa");
    }
}
