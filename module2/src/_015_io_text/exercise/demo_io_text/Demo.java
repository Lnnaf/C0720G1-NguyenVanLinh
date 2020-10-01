package _015_io_text.exercise.demo_io_text;

import java.io.*;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        readFile();
    }

    static void readFile() {
        try {
            File file = new File("C:\\Study\\C0720G1-NguyenVanLinh\\module2\\src\\" +
                    "_015_io_text\\exercise\\demo_io_text\\read.txt");
            Scanner scanner = new Scanner(file);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            FileWriter fileWriter = new FileWriter("C:\\Study\\C0720G1-NguyenVanLinh\\module2\\src\\" +
                    "_015_io_text\\exercise\\demo_io_text\\write.txt");
            while ((scanner.hasNextLine())) {
                line = scanner.nextLine();
                System.out.println(line);
                fileWriter.write(line+"\n");
            }
            reader.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

