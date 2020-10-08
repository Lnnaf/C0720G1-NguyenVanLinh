package models;

public abstract class Service {
    /*Tất cả các dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng,
     Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).*/
    protected String id;
    protected String nameOfService;
    protected String areaUsed;
    protected String priceRent;
    protected String maximumPeople;
    protected String typeOfRent;

    public Service(String id, String nameOfService, String areaUsed, String priceRent, String maximumPeople, String typeOfRent) {
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

    public String getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(String areaUser) {
        this.areaUsed = areaUser;
    }

    public String getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(String priceRent) {
        this.priceRent = priceRent;
    }

    public String getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(String maximumPeople) {
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


    public abstract void showInFor();
}