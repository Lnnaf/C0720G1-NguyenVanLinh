package models;

public class Room extends Service {

    // properties :
    private ExtraService FreeService;

    // method constructor of room:

    public Room() {
    }

    public Room(String id, String nameOfService, String areaUsed, String priceRent, String maximumPeople, String typeOfRent, ExtraService freeService) {
        super(id, nameOfService, areaUsed, priceRent, maximumPeople, typeOfRent);
        FreeService = freeService;
    }

    // get and set of room:


    public ExtraService getFreeService() {
        return FreeService;
    }

    public void setFreeService(ExtraService freeService) {
        FreeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "FreeService=" + FreeService
                ;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}
