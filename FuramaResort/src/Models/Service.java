package Models;

import java.util.List;

public abstract class Service implements ServicePlus {
    /*Tất cả các dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng,
     Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).*/
    protected String id;
    protected String nameOfService;
    protected double areaUsed;
    protected double priceRent;
    protected int maximumPeople;
    protected String typeOfRent;

    public Service(String id, String nameOfService, double areaUsed, double priceRent, int maximumPeople, String typeOfRent) {
        this.id = id;
            this.nameOfService = nameOfService;
        this.areaUsed = areaUsed;
        this.priceRent = priceRent;
        this.maximumPeople = maximumPeople;
        this.typeOfRent = typeOfRent;
    }

    public Service() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String fullName) {
        this.nameOfService = fullName;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUser) {
        this.areaUsed = areaUser;
    }

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "Service " +
                "id='" + id + '\'' +
                ", Name of Service ='" + nameOfService + '\'' +
                ", areaUsed=" + areaUsed +
                ", priceRent=" + priceRent +
                ", maximumPeople=" + maximumPeople +
                ", typeOfRent='" + typeOfRent + '\''
                ;
    }

    @Override
    public void name() {
    }

    @Override
    public void unit() {

    }

    @Override
    public void price() {

    }

    public abstract void showInFor();
}