package _12_java_collection_framework.exercise.ArrayListAndLinkedList;

import java.util.*;

public class ProductManager extends Product {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> listProduct = new ArrayList();

    public static void main(String[] args) {
        displayMainMenu();
    }
    
    public static void displayMainMenu(){
        
        int choose = 0;
        
        do {
            System.out.println("1. Add product." +
                    "\n2. Edit product by id." +
                    "\n3. Delete product by id." +
                    "\n4. Show product. " +
                    "\n5. Search product by name. " +
                    "\n6. Sort product by price decrease" +
                    "\n7. Sort product by price increase" +
                    "\n8. exit.");
            System.out.println("Please input choose (1 - 8): ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    showProducts();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    sortProductByPriceDecrease();
                    break;
                case 7:
                    sortProductByPriceIncrease();
                    break;
                case 8:
                    System.exit(0);
                    break;

            }


        } while (choose >= 1 && choose <= 8);
        
    }

    private static void sortProductByPriceIncrease() {
        Collections.sort(listProduct,Comparator.comparing(Product::getPriceProduct));
        showProducts();
    }

    private static void sortProductByPriceDecrease() {
    }

    private static void searchProductByName() {
        System.out.println("Enter Name for search.");
        String nameSearching = scanner.next();
        for(Product name : listProduct){
            if(name.getName()!=null && name.getName().contains(nameSearching)){
                System.out.println(name);
            }
        }
    }

    private static void showProducts() {
        for(Product show : listProduct){
            System.out.println(show);
        }
    }

    private static void deleteProduct() {
        System.out.println("Enter id product which u want DELETE.");
        int idDelete = scanner.nextInt();
        for(int i = 0; i<listProduct.size();i++){
            if(idDelete-1 == i){
                listProduct.remove(i);
            }
        }
    }

    private static void editProduct() {
        System.out.println("Enter id product which u want edit.");
        int idEdit = scanner.nextInt();
        for(int i = 0; i<listProduct.size();i++){
            if(idEdit-1 == i){
                System.out.println(listProduct.get(i));
                System.out.println("Enter name: ");
                String nameEdited = scanner.next();
                System.out.println("Enter price: ");
                double priceEdited = scanner.nextDouble();
                listProduct.set(i+1,new Product(nameEdited,priceEdited));
            }
        }

    }

    private static void addNewProduct() {
        System.out.println("Please input idProduct: ");
        int idProduct = scanner.nextInt();
        System.out.println("Please input name: ");
        String name = scanner.next();
        System.out.println("Please input priceProduct: ");
        double priceProduct = scanner.nextDouble();
        Product product = new Product(idProduct, name, priceProduct);
        listProduct.add(product);
        System.out.println("Add complete!!!!.....");
        showProducts();
    }


}

