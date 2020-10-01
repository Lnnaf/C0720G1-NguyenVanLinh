package Controllers;

import Models.House;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class MainController {
    public static final String FILE_PATH_HOUSE = "src/Data/House.csv";
    public static final String FILE_PATH_ROOM = "src/Data/Room.csv";
    public static final String FILE_PATH_VILLA = "src/Data/Villa.csv";
    public static final String REGEX = ",";
    static Scanner scanner = new Scanner(System.in);
    private static int id=0;

    public MainController() {
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("*****************************");
            System.out.println("1. Add New Service. " + "\n2. Show Service." + "\n3. Add New Customer"
                    + "\n4. Show Information Customer" + "\n5. Add New Booking" + "\n6. Show Information of Employee"
                    + "\n7. Exit");
            int inputChooseOfMainMenu = scanner.nextInt();
            switch (inputChooseOfMainMenu) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showService();
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
                    System.exit(0);
                    break;
            }
        }


    }

    private static void showService() {
        int inputChooseOfShowService;
        System.out.println("1. Show all Villa"+"\n2. Show all house"+"\n3. Show all room"+
                "\n4. Show all Name Villa Not Duplicate"+
                "\n5. Show all Name House Not Duplicate"+
                "\n6. Show all Name Room Not Duplicate");
        inputChooseOfShowService = scanner.nextInt();
        switch (inputChooseOfShowService){
            case 1:
                System.out.println(House.readHouseCSV());
                break;
            case 2:
            case 3:
        }
    }

    public static void addNewServices() {
        System.out.println("*****************************");
        System.out.println("1.Add New Villa. " +
                "\n2.Add New House " + "\n3.Add New Room" + "\n4.Back to menu" +
                "\n5.Exit");
        int inputChooseOfAddNewServices = scanner.nextInt();
        switch (inputChooseOfAddNewServices){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    private static void addNewRoom() {
        try {
            FileWriter writeRoomData = new FileWriter(FILE_PATH_ROOM,true);
            BufferedWriter bfRoomData = new BufferedWriter(writeRoomData);
            scanner.nextLine();
            System.out.println("Enter New Room");
            String newDataRoom = scanner.nextLine();
            bfRoomData.write(++id+REGEX+newDataRoom);
            bfRoomData.newLine();
            bfRoomData.close();
        }catch (IOException e){
            System.err.println("File does Exist, should be create a new file!");
        }

    }

    private static void addNewHouse() {
        try {
            FileWriter writeHouseData = new FileWriter(FILE_PATH_HOUSE,true);
            BufferedWriter bfHouseData = new BufferedWriter(writeHouseData);
            scanner.nextLine();
            System.out.println("Enter New House");
            String newDataHouse = scanner.nextLine();
            bfHouseData.write(++id+REGEX+newDataHouse);
            bfHouseData.newLine();
            bfHouseData.close();
        }catch (IOException e){
            System.err.println("File does Exist, should be create a new file!");
        }

    }

    private static void addNewVilla() {
        try {
            FileWriter writeVillaData = new FileWriter(FILE_PATH_VILLA,true);
            BufferedWriter bfVillaData = new BufferedWriter(writeVillaData);
            scanner.nextLine();
            System.out.println("Enter New Villa");
            String newDataVilla = scanner.nextLine();
            bfVillaData.write(++id+REGEX+newDataVilla);
            bfVillaData.newLine();
            bfVillaData.close();
        }catch (IOException e){
            System.err.println("File does Exist, should be create a new file!");
        }

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
