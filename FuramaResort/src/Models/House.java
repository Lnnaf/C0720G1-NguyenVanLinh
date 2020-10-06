package Models;


public class House extends Service {

    private String standard;
    private String otherComfort;
    private int numOfFloors;

    public House() {
    }

    public House(String id, String fullName, double areaUser, int priceRent, int maximumPeople, String typeOfRent, String standard, String otherComfort, int numOfFloors) {
        super(id, fullName, areaUser, priceRent, maximumPeople, typeOfRent);
        this.standard = standard;
        this.otherComfort = otherComfort;
        this.numOfFloors = numOfFloors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getOtherComfort() {
        return otherComfort;
    }

    public void setOtherComfort(String otherComfort) {
        this.otherComfort = otherComfort;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +super.toString()+
                "standard='" + standard + '\'' +
                ", otherComfort='" + otherComfort + '\'' +
                ", numOfFloors=" + numOfFloors +
                '}';
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }
}