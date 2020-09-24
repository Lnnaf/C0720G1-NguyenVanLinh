package Models;

public class House extends Service {
    public House(String id) {
        super(id);

    }

    @Override
    public void showInfor() {
        System.out.println(id+" this is house");
    }

}