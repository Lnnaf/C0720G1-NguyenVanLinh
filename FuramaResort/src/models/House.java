package models;


public class House extends Service {

    private String standardHouse;
    private String otherComfortHouse;
    private String numOfFloorsHouse;

    public House() {
    }

    public House(String id, String fullName, String areaUser, String priceRent, String maximumPeople, String typeOfRent, String standardHouse, String otherComfortHouse, String numOfFloorsHouse) {
        super(id, fullName, areaUser, priceRent, maximumPeople, typeOfRent);
        this.standardHouse = standardHouse;
        this.otherComfortHouse = otherComfortHouse;
        this.numOfFloorsHouse = numOfFloorsHouse;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public String getOtherComfortHouse() {
        return otherComfortHouse;
    }

    public void setOtherComfortHouse(String otherComfortHouse) {
        this.otherComfortHouse = otherComfortHouse;
    }

    public String getNumOfFloorsHouse() {
        return numOfFloorsHouse;
    }

    public void setNumOfFloorsHouse(String numOfFloorsHouse) {
        this.numOfFloorsHouse = numOfFloorsHouse;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standard='" + standardHouse + '\'' +
                ", otherComfort='" + otherComfortHouse + '\'' +
                ", numOfFloors=" + numOfFloorsHouse +
                '}';
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}