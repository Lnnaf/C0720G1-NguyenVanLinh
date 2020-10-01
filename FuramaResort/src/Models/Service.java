package Models;

public abstract class Service {

    /*Tất cả các dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng,
     Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).*/
    protected String id;
    protected String fullName;
    protected double areaUser;
    protected int priceRent;
    protected int maximumPeople;
    protected String typeOfRent;

    public Service(String id, String fullName, double areaUser, int priceRent, int maximumPeople, String typeOfRent) {
        this.id = id;
        this.fullName = fullName;
        this.areaUser = areaUser;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(double areaUser) {
        this.areaUser = areaUser;
    }

    public int getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(int priceRent) {
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
        return "Service{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", areaUser=" + areaUser +
                ", priceRent=" + priceRent +
                ", maximumPeople=" + maximumPeople +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }
    public abstract void showInFor();
}