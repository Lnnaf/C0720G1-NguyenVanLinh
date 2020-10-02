package _016_io_binary.exercise;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadFile {
    public static List<Product> readFile() {
        List<Product> listObj = null;
        try {
            FileInputStream readFile = new FileInputStream(MainController.FILE_PATH_PRODUCT);
            ObjectInputStream objectInputStream = new ObjectInputStream(readFile);
            listObj = (List<Product>) objectInputStream.readObject();
        } catch (EOFException c) {
            System.err.println("file is Empty");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listObj;
    }
}
