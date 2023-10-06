package Task1;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "John23"));
        customers.add(new Customer("Bob", "Johnson"));
        customers.add(new Customer("Svend", "SvendTheGret123"));
            printCoustomers(customers);
       

        }

    public static void printCoustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers)
            System.out.println("Navn: " + customer.getFirstName() + "\n" + "Username: " + customer.getUsername());
    }

}

