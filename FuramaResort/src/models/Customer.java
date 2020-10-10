package models;

import java.util.Comparator;

public class Customer  {
    private String nameOfCustomer;
    private String dateOfBirth;
    private String gene;
    private String idCard;
    private int phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Service Service;

    public Customer() {
    }
    public Customer(String nameOfCustomer, String dateOfBirth, String gene, String idCard, int phoneNumber, String email, String typeOfCustomer, String address) {
        this.nameOfCustomer = nameOfCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gene = gene;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String nameOfCustomer, String dateOfBirth, String gene, String idCard, int phoneNumber, String email, String typeOfCustomer, String address, models.Service service) {
        this.nameOfCustomer = nameOfCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gene = gene;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        Service = service;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public models.Service getService() {
        return Service;
    }

    public void setService(models.Service service) {
        Service = service;
    }
public void showInFor(){
    System.out.println(this.toString());
}
    @Override
    public String toString() {
        return "Customer{" +
                "nameOfCustomer='" + nameOfCustomer + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gene='" + gene + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                ", Service=" + Service +
                '}';
    }

}
