import java.util.Scanner;

public class CredentialService extends Employee {

    public CredentialService(String firstName, String lastName) {
        super(firstName, lastName);
        this.fName = firstName;
        this.lName = lastName;
        

    }

    // Determine the department (Technical, Admin, Human Resource, Legal)
    public String department() {
        System.out.println(
                "Please enter the department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
        System.out.print(
                "(Example: Press 1 for Technical Team, Press 2 for Admin): ");
        Scanner sc = new Scanner(System.in);
        int department = sc.nextInt();
        System.out.println("");
        sc.close();

        if (department == 1) {
            return "tech";
        } else if (department == 2) {
            return "admin";
        } else if (department == 3) {
            return "hr";
        } else if (department == 4) {
            return "legal";
        }
        return " ";

    }

    // generate random password
    public String generatePassword(int length) {
        String passwordParameter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890`!@#$%^&*()_+|?/><:;";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int randomPass = (int) (Math.random() * passwordParameter.length());
            password[i] = passwordParameter.charAt(randomPass);

        }
        return new String(password);
    }

    // generateEmailAddress

    public void generateEmailAddress() {

        email = fName.toLowerCase() + lName.toLowerCase() +"@"+ department().toLowerCase()+ "." + emailSuffix;
        System.out.printf("Dear %s your generated credentials are as follows:\nEmail: %s\n",fName,email);

    }

    // showCredentials method

    public void showCredentials() {
        generateEmailAddress();
        System.out.print("Password: "+generatePassword(8));
    }

}
