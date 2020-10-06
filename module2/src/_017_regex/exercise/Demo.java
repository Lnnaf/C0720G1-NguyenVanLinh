package _017_regex.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final  String REGEX = "^[A|C|P]\\d{4}[G|H|I|K|L|M]$";
        Pattern pattern = Pattern.compile(REGEX);
        while (true){
            System.out.println("Nhập");
            String string = sc.nextLine();
            Matcher matcher = pattern.matcher(string);
            if (matcher.find()){
                System.out.println("Đúng");
                break;
            }else {
                System.err.println("Sai");
            }
        }
    }
}

