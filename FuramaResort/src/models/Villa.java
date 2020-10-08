package models;

public class Villa extends Service  {
    private String standard;
    private String otherComfort;
    private String areaPool;
    private String numOfFloors;

    public Villa() {
    }

    public Villa(String id, String fullName, String areaUsed, String priceRent, String maximumPeople, String typeOfRent, String standard, String otherComfort, String areaPool, String numOfFloors) {
        super(id, fullName, areaUsed, priceRent, maximumPeople, typeOfRent);
        this.standard = standard;
        this.otherComfort = otherComfort;
        this.areaPool = areaPool;
        this.numOfFloors = numOfFloors;
    }

    public String getStandard() {

        return standard;
    }

    public void setStandard(String standard) {

        this.standard = standard;
    }

    public String getOtherComfort()
    {
        return otherComfort;
    }

    public void setOtherComfort(String otherComfort) {
        this.otherComfort = otherComfort;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(String numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                "standard='" + standard + '\'' +
                ", otherComfort='" + otherComfort + '\'' +
                ", areaPool=" + areaPool +
                ", numOfFloors=" + numOfFloors ;
    }

}
