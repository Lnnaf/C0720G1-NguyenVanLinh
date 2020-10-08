package models;

public class Room extends Service {

    private Service serviceFreeInSite;

    public Room() {
    }

    public Room(String id, String fullName, String areaUser, String priceRent, String maximumPeople, String typeOfRent, Service serviceFreeInSite) {
        super(id, fullName, areaUser, priceRent, maximumPeople, typeOfRent);
        this.serviceFreeInSite = serviceFreeInSite;
    }

    public Service getServiceFreeInSite() {
        return serviceFreeInSite;
    }

    public void setServiceFreeInSite(Service serviceFreeInSite) {
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
