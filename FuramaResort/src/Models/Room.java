package Models;

public class Room extends Service {

    private String serviceFreeInSite;

    public Room() {
    }

    public Room(String id, String fullName, String areaUser, String priceRent, String maximumPeople, String typeOfRent, String serviceFreeInSite) {
        super(id, fullName, areaUser, priceRent, maximumPeople, typeOfRent);
        this.serviceFreeInSite = serviceFreeInSite;
    }

    public String getServiceFreeInSite() {
        return serviceFreeInSite;
    }

    public void setServiceFreeInSite(String serviceFreeInSite) {
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
