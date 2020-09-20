package Models;

public class Room extends Service {
    public Room(String id) {
        super(id);
    }

    @Override
    void showInfor() {
        System.out.println("this is room");
    }
}
