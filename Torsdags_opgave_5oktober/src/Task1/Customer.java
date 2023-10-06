package Task1;

public class Customer {
   private String firstName;
   private String lastName;
   private String username;
   private int id;

    public Customer(String firstName, String username) {
        this.firstName = firstName;
        this.username = username;
    }
        @Override //man overskriver en tidligere metode.
        public String toString() {
            return "firstname: " + firstName + "\n" + "Username " + username;

        }
        public String getFirstName() {
        return firstName;
        }
        public String getLastName(){
        return lastName;
        }
        public String getUsername() {
        return username;
        }
        public int getid(){
            return id;
        }



    }



