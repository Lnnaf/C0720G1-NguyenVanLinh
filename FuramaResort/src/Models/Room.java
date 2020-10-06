package Models;

public class Room extends Service {

    private String serviceFreeInSite;

    public Room() {
    }

    public Room(String id, String fullName, double areaUser, int priceRent, int maximumPeople, String typeOfRent, String serviceFreeInSite) {
        super(id, fullName, areaUser, priceRent, maximumPeople, typeOfRent);
        this.serviceFreeInSite = serviceFreeInSite;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "serviceFreeGoWith='" + serviceFreeInSite + '\'' +
                '}';
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}
