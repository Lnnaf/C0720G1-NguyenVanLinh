package _016_io_binary.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainController implements Serializable {
    public static List<Product> productList =new ArrayList<>();
    public static final String FILE_PATH_PRODUCT = "C:\\Study\\C0720G1-NguyenVanLinh\\module2\\src\\_016_io_binary\\exercise\\product.txt";

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add new product:" + "\n2. Show all list product" + "\n3. Find product by id" + "\n4. Exit");
        try{
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    showAllProduct();
                    break;
                case 3:
                    System.out.println(FindProduct.findById());
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }catch (NumberFormatException e){
            System.err.println("Pls enter number");
        }

        }

    }

    private static void showAllProduct() {
        System.out.println(ReadFile.readFile());
    }

    private static void addNewProduct() {
        try{
            Scanner scanner = new Scanner(System.in);
            Product product = new Product();
            System.out.println("Enter ID:");
            product.setIdProduct(scanner.nextLine());
            System.out.println("Enter Name Product");
            product.setNameProduct(scanner.nextLine());
            System.out.println("Enter Name Manufacturer");
            product.setNameManufacturer(scanner.nextLine());
            System.out.println("Enter price (USD $)");
            product.setPrice(Integer.parseInt(scanner.nextLine()));
            System.out.println("Enter Description");
            product.setOtherDescription(scanner.nextLine());
            productList.add(product);
            WriteFile.writeFile();
        } catch (InputMismatchException e){
            System.err.println("Nhap sai dinh dang");
        }
    }



    public static void main(String[] args) {
        ReadFile.readFile();
        displayMenu();
    }
}
