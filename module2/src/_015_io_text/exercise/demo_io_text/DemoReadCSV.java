package _015_io_text.exercise.demo_io_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoReadCSV {
    public static void main(String[] args) {
        readFile();
    }

    static void readFile() {
        try {
            File file = new File("src/_015_io_text/exercise/demo_io_text/nation.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] nation =line.split(",");
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
