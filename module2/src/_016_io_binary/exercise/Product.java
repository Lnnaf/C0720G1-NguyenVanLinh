package _016_io_binary.exercise;

public class Product {

    String idProduct;
    String nameProduct;
    String nameManufacturer;
    double price;
    String otherDescription;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, String nameManufacturer, double price, String otherDescription) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.nameManufacturer = nameManufacturer;
        this.price = price;
        this.otherDescription = otherDescription;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return "Product Information: \n" +
                "ID PRODUCT = " + idProduct + '\'' +
                ", NAME PRODUCT = '" + nameProduct + '\'' +
                ", NAME MANUFACTURE= '" + nameManufacturer + '\'' +
                ", price = " + price + " $" +
                ", DESCRIPTION = '" + otherDescription + '\n'
                ;
    }


}

