package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ProfileBox {
    private static final String FILE_PATH_EMPLOYEE = "src/data/Employee.csv";

    public static void searchProfile() {
        Scanner scanner = new Scanner(System.in);
        try {

            FileReader fileReader = new FileReader(FILE_PATH_EMPLOYEE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Stack<Employee> listStack = new Stack<Employee>();
            String temp = null;
            String[] line = null;
            while ((temp = bufferedReader.readLine()) != null) {
                line = temp.split(",");
                Employee employee = new Employee(line[0], line[1], line[2]);
                listStack.push(employee);
            }
            System.out.println("Enter Name to search:");
            String name = scanner.nextLine();
            while (!listStack.isEmpty()) {
                Employee employee = listStack.pop();
                if (name.equals(employee.getNameEmployee())) {
                    System.out.println(employee);
                    break;
                }
            }
            if (listStack.isEmpty()) {
                System.err.println("Name Of Employ you are searching is not Exist in System");
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
