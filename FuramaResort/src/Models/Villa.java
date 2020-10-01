package Models;

import org.w3c.dom.ls.LSOutput;

public class Villa extends Service {

    private String standard;
    private String otherComfort;
    private double areaPool;
    private int numOfFloors;

    public Villa() {
    }

    public Villa(String id, String fullName, double areaUser, int priceRent, int maximumPeople, String typeOfRent, String standard, String otherComfort, double areaPool, int numOfFloors) {
        super(id, fullName, areaUser, priceRent, maximumPeople, typeOfRent);
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

    public String getOtherComfort() {
        return otherComfort;
    }

    public void setOtherComfort(String otherComfort) {
        this.otherComfort = otherComfort;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", otherComfort='" + otherComfort + '\'' +
                ", areaPool=" + areaPool +
                ", numOfFloors=" + numOfFloors +
                '}'+super.toString();
    }
}
