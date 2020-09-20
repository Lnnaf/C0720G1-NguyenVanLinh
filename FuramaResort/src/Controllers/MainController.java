package Controllers;

import java.util.Scanner;

public class MainController {
    static  Scanner scanner = new Scanner(System.in);
    public  MainController() {
    }
    public static void displayMainMenu(){
        System.out.println("1. Add New Service. ");
        System.out.println("2. Show Services. ");
        System.out.println("3. Add New Customer. ");
        System.out.println("4.\tShow Information of Customer. ");
        System.out.println("5.\tAdd New Booking. ");
        System.out.println("6.\tShow Information of Employee. ");
        System.out.println("7.\tExit. ");
        int inputChooseOfMainMenu = scanner.nextInt();

        switch (inputChooseOfMainMenu){
            case 1:
                MainController.addNewServices();
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
        }
    }
    public static void addNewServices(){
        System.out.println("1.\tAdd New Villa. ");
        System.out.println("2.\tAdd New House ");
        System.out.println("3.\tAdd New Room");
        System.out.println("4.\tBack to menu");
        System.out.println("5.\tExit");
        int inputChooseOfAddNewServices = scanner.nextInt();

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
