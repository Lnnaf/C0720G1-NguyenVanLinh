package Controllers;

import Models.House;
import Models.Villa;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainController {
    public static final String FILE_PATH_VILLA = "C:\\Study\\C0720G1-NguyenVanLinh\\FuramaResort\\src\\Data\\Villa.csv";
    public static final String[] HEADER = {"Id", "FullName", "AreaUsed", "PriceRent", "MaxPeople", "TypeOfRent", "Standard", "OtherComfort", "AreaPool", "NumOfFloor"};
    protected static List<Villa> listVilla = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static Villa villaModel = new Villa();

    public static void displayMainMenu() {
        while (true) {
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
                showAllVilla();
                break;
            case 2:
            case 3:
        }
    }

    protected static void showAllVilla()  {
        BufferedReader reader;
        try {
            reader = Files.newBufferedReader(Paths.get(FILE_PATH_VILLA));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL.withHeader(HEADER).withSkipHeaderRecord().withTrim());
        for(CSVRecord csvRecord:csvParser){
            villaModel.setId(csvRecord.get(0));
            villaModel.setNameOfService(csvRecord.get(1));
            villaModel.setAreaUsed(Double.parseDouble(csvRecord.get(2)));
            villaModel.setPriceRent(Double.parseDouble(csvRecord.get(3)));
            villaModel.setMaximumPeople(Integer.parseInt(csvRecord.get(4)));
            villaModel.setTypeOfRent(csvRecord.get(5));
            villaModel.setStandard(csvRecord.get(6));
            villaModel.setOtherComfort(csvRecord.get(7));
            villaModel.setAreaPool(Double.parseDouble(csvRecord.get(8)));
            villaModel.setNumOfFloors(Integer.parseInt(csvRecord.get(9)));

            villaModel.showInFor();
        }

        } catch (IOException e) {
            e.printStackTrace();
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

    }

    private static void addNewHouse() {

    }

    private static void addNewVilla() {
        scanner.nextLine();
        System.out.println("1. ENTER ID.");
        villaModel.setId(scanner.nextLine());
        System.out.println("2. ENTER NAME OF SERVICE. ");
        villaModel.setNameOfService(scanner.nextLine());
        System.out.println("3. ENTER AREA FOR USE. ");
        villaModel.setAreaUsed(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("4. ENTER PRICE. ");
        villaModel.setPriceRent(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("5. ENTER AMOUNT PEOPLE. ");
        villaModel.setMaximumPeople(Integer.parseInt(scanner.nextLine()));
        System.out.println("6. ENTER TYPE OF RENTS . ");
        villaModel.setTypeOfRent(scanner.nextLine());
        System.out.println("7. ENTER STANDARD. ");
        villaModel.setStandard(scanner.nextLine());
        System.out.println("8. ENTER OTHER COMFORT. ");
        villaModel.setOtherComfort(scanner.nextLine());
        System.out.println("9. ENTER AREA POOL. ");
        villaModel.setAreaPool(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("10. ENTER NUMBER OF FLOOR. ");
        villaModel.setNumOfFloors(Integer.parseInt(scanner.nextLine()));

        Villa villa = new Villa(villaModel.getId(), villaModel.getNameOfService(),villaModel.getAreaUsed(),villaModel.getPriceRent(),
                villaModel.getMaximumPeople(),villaModel.getTypeOfRent(),villaModel.getStandard(),villaModel.getOtherComfort(),
                villaModel.getAreaPool(),villaModel.getNumOfFloors());
        try {
            Writer writer = Files.newBufferedWriter(Paths.get(FILE_PATH_VILLA),StandardOpenOption.APPEND);
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
            listVilla.add(villa);
           for(Villa villa1 :listVilla ){
               csvPrinter.printRecord(villa1.getId(),villa1.getNameOfService(),villa1.getAreaUsed(),villa1.getPriceRent(),
                       villa1.getMaximumPeople(),villa1.getTypeOfRent(),villa1.getStandard(),villa1.getOtherComfort(),
                       villa1.getAreaPool(), villa1.getNumOfFloors());
           }
            csvPrinter.flush();
            csvPrinter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
