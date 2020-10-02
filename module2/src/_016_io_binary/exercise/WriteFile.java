package _016_io_binary.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteFile{
    public static void writeFile() {
        try {
            FileOutputStream write = new FileOutputStream(MainController.FILE_PATH_PRODUCT);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(write);
            objectOutputStream.writeObject(MainController.productList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
