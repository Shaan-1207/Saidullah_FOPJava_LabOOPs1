import java.util.Scanner;

public class Employee {
    String email;
    String emailSuffix = "restrowork.com";
    String fName, lName;

    public Employee() {

    }
    //parameterized constructor of class Employee, to pass firstName, lastName.
    public Employee(String firstName, String lastName) {
        this.fName = firstName;
        this.lName = lastName;
    }

 
    //Main method 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String fname = sc.next();

        System.out.print("Enter your Last Name: ");
        String lname = sc.next();
        
        CredentialService credential = new CredentialService(fname, lname);
        credential.showCredentials();
        

        sc.close();
    }


}
