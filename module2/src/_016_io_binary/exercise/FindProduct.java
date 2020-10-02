package _016_io_binary.exercise;

import java.util.Scanner;

public class FindProduct {
    static Product findById() {
        ReadFile.readFile();
        MainController.productList = ReadFile.readFile();
        String id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id:");
        id = scanner.nextLine();
        for (Product product : MainController.productList) {
            if (product.getIdProduct().equals(id)) {
                return product;
            }
        }
        return null;
    }

}
