package controllers;

import commons.*;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.io.*;
import java.util.*;


public class MainController {
    public static final String FILE_PATH_VILLA = "src/Data/Villa.csv";
    public static final String FILE_PATH_HOUSE = "src/Data/House.csv";
    public static final String FILE_PATH_ROOM = "src/Data/Room.csv";
    public static final String FILE_PATH_CUSTOMER = "src/Data/Customer.csv";

    static Scanner scanner = new Scanner(System.in);
    public static Villa villaModel = new Villa();
    public static House houseModel = new House();
    public static Room roomModel = new Room();
    public static Customer customerModel = new Customer();

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
                    addNewCustomer();
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

    private static void addNewCustomer() {
        //**Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email,
        //Loại khách, Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services**//
        boolean check = false;
        try {
            do {
                try {
                    scanner.nextLine();
                    System.out.println("1. ENTER NAME.");
                    String inputName = scanner.nextLine();
                    check = Validator.regexNameOfCustomer(inputName);
                    if (check) {
                        customerModel.setNameOfCustomer(inputName);
                        break;
                    } else {
                        throw new NameException("");
                    }

                } catch (InputMismatchException | NameException e) {
                    System.out.println(e.getMessage());
                }
            } while (!check);
            check = false;
//input date of birth
            do {
                try {
                    System.out.println("2. ENTER DATE OF BIRTH.");
                    String inputBirthday = scanner.nextLine();
                    check = Validator.regexDateOfBirth(inputBirthday);

                    if (check) {
                        String[] arrDate = inputBirthday.split("/");
                        int year = Calendar.getInstance().get(Calendar.YEAR);
                        int yearInput = Integer.parseInt(arrDate[2]);
                        if (yearInput > 1900 && year - yearInput >= 18) {
                            customerModel.setDateOfBirth(inputBirthday);
                            break;
                        } else {
                            check = false;
                            throw new BirthdayException("");
                        }
                    } else {
                        throw new BirthdayException("");
                    }
                } catch (InputMismatchException | BirthdayException e) {
                    System.out.println(e.getMessage());
                }
            } while (!check);

            check = false;
//input gender
            do {
                try {
                    System.out.println("3. ENTER GENDER.");
                    String inputGene = scanner.nextLine();
                    String tempInputGender = inputGene.toLowerCase();
                    check = Validator.regexGender(tempInputGender);
                    if (check) {
                        char first = Character.toUpperCase(tempInputGender.charAt(0));
                        inputGene = first+tempInputGender.substring(1);
                        customerModel.setGene(inputGene);
                        break;
                    } else {
                        throw new GenderException("");
                    }
                } catch (InputMismatchException | GenderException e) {
                    System.out.println(e.getMessage());
                }
            } while (!check);
            check = false;
// INPUT ID CARD
            do {
                try {
                    System.out.println("4. ENTER ID CARD.");
                    String inputIDCard = scanner.nextLine();
                    check = Validator.regexIDCard(inputIDCard);
                    if (check) {
                        customerModel.setIdCard(inputIDCard);
                        break;
                    } else {
                        throw new IDCardException("");
                    }
                } catch (InputMismatchException | IDCardException e) {
                    System.out.println(e.getMessage());
                }
            } while (!check);
// INPUT PHONE NUMBER
            int inputPhoneNumber=0;
           do {
                System.out.println("5. ENTER PHONE NUMBER.");
                try {
                    inputPhoneNumber = Integer.parseInt(scanner.nextLine());
                    check=true;

                } catch (NumberFormatException e) {
                    System.out.println("Please enter only number");
                    check=false;
                }
            }while (!check);
            customerModel.setPhoneNumber(inputPhoneNumber);
            check=false;
            // INPUT EMAIL
            do {
                try {
                    System.out.println("5. ENTER EMAIL.");
                    String inputEmail = scanner.nextLine();
                    check = Validator.regexEmail(inputEmail);
                    if (check) {
                        customerModel.setEmail(inputEmail);
                        break;
                    } else {
                        throw new EmailException("");
                    }
                } catch (InputMismatchException | EmailException e) {
                    System.out.println(e.getMessage());
                }
            } while (!check);
            check=false;
            do {
                try {
                    System.out.println("6. ENTER TYPE OF CUSTOMER.");
                    String inputEmail = scanner.nextLine();
                    check = Validator.regexEmail(inputEmail);
                    if (check) {
                        customerModel.setEmail(inputEmail);
                        break;
                    } else {
                        throw new EmailException("");
                    }
                } catch (InputMismatchException | EmailException e) {
                    System.out.println(e.getMessage());
                }
            } while (!check);


            Room room = new Room(roomModel.getId(), roomModel.getNameOfService(), roomModel.getAreaUsed(), roomModel.getPriceRent(),
                    roomModel.getMaximumPeople(), roomModel.getTypeOfRent(), roomModel.getServiceFreeInSite());


            String line = room.getId() + "," + room.getNameOfService() + "," + room.getAreaUsed() + "," + room.getPriceRent() + "," +
                    room.getMaximumPeople() + "," + room.getTypeOfRent() + "," + room.getServiceFreeInSite() + "\n";


            FileWriter fileWriter = new FileWriter(FILE_PATH_ROOM, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showService() {
        int inputChooseOfShowService;
        System.out.println("1. Show all Villa" + "\n2. Show all house" + "\n3. Show all room" +
                "\n4. Show all Name Villa Not Duplicate" +
                "\n5. Show all Name House Not Duplicate" +
                "\n6. Show all Name Room Not Duplicate");
        inputChooseOfShowService = scanner.nextInt();
        switch (inputChooseOfShowService) {
            case 1:
                showAllVilla();
                break;
            case 2:
            case 3:
        }
    }

    protected static void showAllVilla() {
        try {

            FileReader fileReader = new FileReader(FILE_PATH_VILLA);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            List<Villa> listVilla = new ArrayList<>();
            String temp = null;
            String[] line = null;
            while ((temp = bufferedReader.readLine()) != null) {
                line = temp.split(",");
                Villa villa = new Villa(line[0], line[1], line[2], line[3], line[4], line[5],
                        line[6], line[7], line[8], line[9]);
                listVilla.add(villa);
            }
            for (Villa villa1 : listVilla) {
                villa1.showInFor();
            }

            bufferedReader.close();

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
        switch (inputChooseOfAddNewServices) {
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
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    private static void addNewRoom() {
        boolean check;
        try {
            do {
                scanner.nextLine();
                System.out.println("1. ENTER ID.");
                String inputID = scanner.nextLine();
                check = Validator.regexId(inputID);
                if (check) {
                    roomModel.setId(inputID);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("2. ENTER NAME OF SERVICE. ");
                String inputNameService = scanner.nextLine();
                check = Validator.regexNameService(inputNameService);
                if (check) {
                    roomModel.setNameOfService(inputNameService);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("3. ENTER AREA FOR USE. ");
                String inputAreaUse = scanner.nextLine();
                check = Validator.regexAreaOfUse(inputAreaUse);
                if (check) {
                    roomModel.setAreaUsed(inputAreaUse);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("4. ENTER PRICE. ");
                String inputPrice = scanner.nextLine();
                check = Validator.regexPriceRent(inputPrice);
                if (check) {
                    roomModel.setPriceRent(inputPrice);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("5. ENTER NUMBER OF PEOPLE. ");
                String inputNumOfPeople = scanner.nextLine();
                check = Validator.regexMaxPeople(inputNumOfPeople);
                if (check) {
                    roomModel.setMaximumPeople(inputNumOfPeople);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("6. ENTER TYPE OF RENTS . ");
                String typeOfRent = scanner.nextLine();
                check = Validator.regexRentalType(typeOfRent);
                if (check) {
                    roomModel.setTypeOfRent(typeOfRent);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("7. ENTER FREE SERVICE IN SITE . ");
                String typeOfRent = scanner.nextLine();
                check = Validator.regexRentalType(typeOfRent);
                if (check) {
                    roomModel.setServiceFreeInSite(typeOfRent);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            Room room = new Room(roomModel.getId(), roomModel.getNameOfService(), roomModel.getAreaUsed(), roomModel.getPriceRent(),
                    roomModel.getMaximumPeople(), roomModel.getTypeOfRent(), roomModel.getServiceFreeInSite());


            String line = room.getId() + "," + room.getNameOfService() + "," + room.getAreaUsed() + "," + room.getPriceRent() + "," +
                    room.getMaximumPeople() + "," + room.getTypeOfRent() + "," + room.getServiceFreeInSite() + "\n";


            FileWriter fileWriter = new FileWriter(FILE_PATH_ROOM, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void addNewHouse() {
        boolean check;
        try {
            String inputNameService;
            String inputAreaUse;
            do {
                scanner.nextLine();
                System.out.println("1. ENTER ID.");
                String inputID = scanner.nextLine();
                check = Validator.regexId(inputID);
                if (check) {
                    houseModel.setId(inputID);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("2. ENTER NAME OF SERVICE. ");
                inputNameService = scanner.nextLine();
                check = Validator.regexNameService(inputNameService);
                if (check) {
                    houseModel.setNameOfService(inputNameService);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("3. ENTER AREA FOR USE. ");
                inputAreaUse = scanner.nextLine();
                check = Validator.regexAreaOfUse(inputAreaUse);
                if (check) {
                    houseModel.setAreaUsed(inputAreaUse);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("4. ENTER PRICE. ");
                String inputPrice = scanner.nextLine();
                check = Validator.regexPriceRent(inputPrice);
                if (check) {
                    houseModel.setPriceRent(inputPrice);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("5. ENTER NUMBER OF PEOPLE. ");
                String inputNumOfPeople = scanner.nextLine();
                check = Validator.regexMaxPeople(inputNumOfPeople);
                if (check) {
                    houseModel.setMaximumPeople(inputNumOfPeople);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("6. ENTER TYPE OF RENTS . ");
                String typeOfRent = scanner.nextLine();
                check = Validator.regexRentalType(typeOfRent);
                if (check) {
                    houseModel.setTypeOfRent(typeOfRent);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("7. ENTER STANDARD . ");
                String inputStandard = scanner.nextLine();
                check = Validator.regexStandard(inputStandard);
                if (check) {
                    houseModel.setStandardHouse(inputStandard);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);


            System.out.println("8. ENTER OTHER COMFORT. ");
            String inputOtherComfort = scanner.nextLine();
            houseModel.setOtherComfortHouse(inputOtherComfort);

            check = false;
            do {
                System.out.println("9. ENTER NUMBER OF FLOOR. ");
                String inputNumOfFloor = scanner.nextLine();
                check = Validator.regexFloor(inputNumOfFloor);
                if (check) {
                    houseModel.setNumOfFloorsHouse(inputNumOfFloor);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            House house = new House(houseModel.getId(), houseModel.getNameOfService(), houseModel.getAreaUsed(), houseModel.getPriceRent(),
                    houseModel.getMaximumPeople(), houseModel.getTypeOfRent(), houseModel.getStandardHouse(), houseModel.getOtherComfortHouse(), houseModel.getNumOfFloorsHouse());


            String line = house.getId() + "," + house.getNameOfService() + "," + house.getAreaUsed() + "," + house.getPriceRent() + "," +
                    house.getMaximumPeople() + "," + house.getTypeOfRent() + "," + house.getStandardHouse() + "," + house.getOtherComfortHouse() + "," + house.getNumOfFloorsHouse() + "\n";


            FileWriter fileWriter = new FileWriter(FILE_PATH_HOUSE, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void addNewVilla() {
        boolean check;
        try {
            String inputID;
            String inputNameService;
            String inputAreaUse;
            do {
                scanner.nextLine();
                System.out.println("1. ENTER ID.");
                inputID = scanner.nextLine();
                check = Validator.regexId(inputID);
                if (check) {
                    villaModel.setId(inputID);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("2. ENTER NAME OF SERVICE. ");
                inputNameService = scanner.nextLine();
                check = Validator.regexNameService(inputNameService);
                if (check) {
                    villaModel.setNameOfService(inputNameService);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("3. ENTER AREA FOR USE. ");
                inputAreaUse = scanner.nextLine();
                check = Validator.regexAreaOfUse(inputAreaUse);
                if (check) {
                    villaModel.setAreaUsed(inputAreaUse);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);
            check = false;
            do {
                System.out.println("4. ENTER PRICE. ");
                String inputPrice = scanner.nextLine();
                check = Validator.regexPriceRent(inputPrice);
                if (check) {
                    villaModel.setPriceRent(inputPrice);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("5. ENTER NUMBER OF PEOPLE. ");
                String inputNumOfPeople = scanner.nextLine();
                check = Validator.regexMaxPeople(inputNumOfPeople);
                if (check) {
                    villaModel.setMaximumPeople(inputNumOfPeople);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("6. ENTER TYPE OF RENTS . ");
                String typeOfRent = scanner.nextLine();
                check = Validator.regexRentalType(typeOfRent);
                if (check) {
                    villaModel.setTypeOfRent(typeOfRent);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("7. ENTER STANDARD. ");
                String inputStandard = scanner.nextLine();
                check = Validator.regexStandard(inputStandard);
                if (check) {
                    villaModel.setStandard(inputStandard);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);


            System.out.println("8. ENTER OTHER COMFORT. ");
            String inputOtherComfort = scanner.nextLine();
            villaModel.setOtherComfort(inputOtherComfort);

            check = false;
            do {
                System.out.println("9. ENTER AREA POOL. ");
                String inputAreaPool = scanner.nextLine();
                check = Validator.regexAreaPool(inputAreaPool);
                if (check) {
                    villaModel.setAreaPool(inputAreaPool);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            check = false;
            do {
                System.out.println("10. ENTER NUMBER OF FLOOR. ");
                String inputNumOfFloor = scanner.nextLine();
                check = Validator.regexFloor(inputNumOfFloor);
                if (check) {
                    villaModel.setNumOfFloors(inputNumOfFloor);
                    break;
                } else {
                    System.out.println("Wrong format warnning, please try again!");
                }
            } while (!check);

            Villa villa = new Villa(villaModel.getId(), villaModel.getNameOfService(), villaModel.getAreaUsed(), villaModel.getPriceRent(),
                    villaModel.getMaximumPeople(), villaModel.getTypeOfRent(), villaModel.getStandard(), villaModel.getOtherComfort(),
                    villaModel.getAreaPool(), villaModel.getNumOfFloors());


            String line = villa.getId() + "," + villa.getNameOfService() + "," + villa.getAreaUsed() + "," + villa.getPriceRent() + "," +
                    villa.getMaximumPeople() + "," + villa.getTypeOfRent() + "," + villa.getStandard() + "," + villa.getOtherComfort() + "," +
                    villa.getAreaPool() + "," + villa.getNumOfFloors() + "\n";

            FileWriter fileWriter = new FileWriter(FILE_PATH_VILLA, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
