package commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean regexEmail(String gender) {
        final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(gender);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexIDCard(String gender) {
        final String REGEX_ID_CARD = "\\d{3}\\s\\d{3}\\s\\d{3}";
        Pattern pattern = Pattern.compile(REGEX_ID_CARD);
        Matcher matcher = pattern.matcher(gender);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexGender(String gender) {
        final String REGEX_GENDER = "(male)|(female)|(unknow)";
        Pattern pattern = Pattern.compile(REGEX_GENDER);
        Matcher matcher = pattern.matcher(gender);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexDateOfBirth(String birthDay) {
        final String REGEX_DATE_OF_BIRTH = "^([0-2][0-9]|(3)[0-1])[/](((0)[1-9])|((1)[0-2]))[/]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_DATE_OF_BIRTH);
        Matcher matcher = pattern.matcher(birthDay);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexNameOfCustomer(String name) {
        final String REGEX_NAME = "^([A-Z]{1}([a-z])*)(\\s[A-Z]{1}[a-z]*)*$";
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexNameService(String name) {
        final String REGEX_NAME = "^[A-Z]{1}[a-z,A-Z]*";
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexId(String id) {
        final String REGEX_ID = "^SV(VL|HO|RO)-\\d{4}";
        Pattern pattern = Pattern.compile(REGEX_ID);
        Matcher matcher = pattern.matcher(id);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexAreaOfUse(String areaOfUse) {
        final String REGEX_AREA_OF_USE = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(REGEX_AREA_OF_USE);
        Matcher matcher = pattern.matcher(areaOfUse);
        boolean check = matcher.matches();
        return check;
//        float area = Float.parseFloat(areaOfUse);
//        boolean check;
//        if (area>=30){
//            check=true;
//        }else {
//            check=false;
//        }
//        return check;
    }

    public static boolean regexAreaPool(String poolArea) {
        final String REGEX_AREA_POOL = "^([3][0]\\.\\d+)|([3][1-9]\\.?\\d*)|([4-9]\\d\\.?\\d*)|(\\d{3,}\\.?\\d*)$";
        Pattern pattern = Pattern.compile(REGEX_AREA_POOL);
        Matcher matcher = pattern.matcher(poolArea);
        boolean check = matcher.matches();
        return check;
//        float area = Float.parseFloat(poolArea);
//        boolean check;
//        if (area>=30){
//            check=true;
//        }else {
//            check=false;
//        }
//        return check;
    }

    public static boolean regexPriceRent(String rentalCost) {
        final String REGEX_PRICE_RENT = "^[1-9]\\d*$";
        Pattern pattern = Pattern.compile(REGEX_PRICE_RENT);
        Matcher matcher = pattern.matcher(rentalCost);
        boolean check = matcher.matches();
        return check;

    }

    public static boolean regexMaxPeople(String maxPeople) {
        final String REGEX_MAXPEOPLE = "[1-9]|1\\d{1}|[20]";
        Pattern pattern = Pattern.compile(REGEX_MAXPEOPLE);
        Matcher matcher = pattern.matcher(maxPeople);
        boolean check = matcher.matches();
        return check;

    }

    public static boolean
    regexFreeConvenient(String freeConvenient) {
        final String REGEX_FREE_CONVENIENT = "(massage|karaoke|food|drink|car)";
        Pattern pattern = Pattern.compile(REGEX_FREE_CONVENIENT);
        Matcher matcher = pattern.matcher(freeConvenient);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexFloor(String floor) {
        final String REGEX_FLOOR = "[1-9]\\d{0,}$";
        Pattern pattern = Pattern.compile(REGEX_FLOOR);
        Matcher matcher = pattern.matcher(floor);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexRentalType(String rentalType) {
        final String REGEXRENTALTYPE = "^[A-Z,a-z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(REGEXRENTALTYPE);
        Matcher matcher = pattern.matcher(rentalType);
        boolean check = matcher.matches();
        return check;
    }

    public static boolean regexStandard(String standard) {
        final String REGEXSTANDARD = "^[A-Z]{1}[a-z]*";
        Pattern pattern = Pattern.compile(REGEXSTANDARD);
        Matcher matcher = pattern.matcher(standard);
        boolean check = matcher.matches();
        return check;
    }
}
