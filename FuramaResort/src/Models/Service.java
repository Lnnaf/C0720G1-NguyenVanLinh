package Models;

public abstract class Service {
    String id;

    public Service(String id) {
        this.id = id;
    }

     public abstract void showInfor();


    public static void main(String[] args) {
        House house = new House("1");
        house.showInfor();

    }
}