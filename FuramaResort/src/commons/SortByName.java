package commons;

import models.Customer;

import java.util.Comparator;

public class SortByName implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {

        int result = customer1.getNameOfCustomer().compareTo(customer2.getNameOfCustomer());
        if (result == 0) {
            result = customer1.getDateOfBirth().substring(6, 10).compareTo(customer2.getDateOfBirth().substring(6, 10));
        }
        return result;
    }

}
