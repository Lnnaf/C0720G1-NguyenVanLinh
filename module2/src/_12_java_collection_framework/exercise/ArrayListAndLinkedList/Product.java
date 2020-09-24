package _12_java_collection_framework.exercise.ArrayListAndLinkedList;

public class Product {

    //properties product:

    private int idProduct;
    private String name;
    private double priceProduct;

    // method constructor:

    public Product() {
    }

    public Product(String name, double priceProduct) {
        this.name = name;
        this.priceProduct = priceProduct;
    }

    public Product(int idProduct, String name, double priceProduct) {
        this.idProduct = idProduct;
        this.name = name;
        this.priceProduct = priceProduct;
    }

    // get and set:


    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void showInFor() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return
                "id= " + idProduct  +
                ", name= " + name +
                ", price= " + priceProduct+" VND";
    }
}
