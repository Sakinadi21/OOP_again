package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getter for password
    public String getPassword() {
        return this.password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Sakiba";
        account1.email = "sakibabelal@gmail.com";
        // Use the setter method to set the password
        account1.setPassword("abcd");
        // Print the password using the getter method
        System.out.println(account1.getPassword());
    }
}
