package Commons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static boolean regexNameOfCustomer(String name) {
        final String REGEX_NAME = "^[A-Z]{1}[a-z](\\s[A-Z]{1}[a-z])*$";
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
        final String REGEX_ID = "^F(VL|H|R)-\\d{4}";
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
//        int costRental= Integer.parseInt(rentalCost);
//        boolean check;
//        if(costRental>0){
//            check= true;
//        }else {
//            check=false;
//        }
//        return check;
    }
    public static boolean regexMaxPeople(String maxPeople) {
        final String REGEX_MAXPEOPLE = "[1-9]|1\\d{1}|[20]";
        Pattern pattern = Pattern.compile(REGEX_MAXPEOPLE);
        Matcher matcher = pattern.matcher(maxPeople);
        boolean check = matcher.matches();
        return check;
//        int people= Integer.parseInt(maxPeople);
//        boolean check;
//        if(people>0&&people<20){
//            check=true;
//        }else {
//            check=false;
//        }
//        return check;
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
