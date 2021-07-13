import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + // part before @
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static boolean isValidUsername(String name) {
        String regex = "^[a-zA-Z]*$";
        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static boolean isValidPassword(String password) {
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 8) {
            System.out.println("Password must be less than 20 and more than 8 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            System.out.println("Password must have atleast one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            System.out.println("Password must have atleast one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            System.out.println("Password must have atleast one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars)) {
            System.out.println("Password must have atleast one special character among @#$%");
            isValid = false;
        }
        return isValid;
    }

    public static void main(String[] args) {
        // email
        String email1 = "latha@g.com";
        String email2 = "@latha.com";
        String email3 = "latha.v@y.com";
        String[] emails = { email1, email2, email3 };

        for (int i = 0; i < emails.length; i++) {
            String email = emails[i];
            if (isValid(email))
                System.out.print(email + " is valid email");
            else
                System.out.print(email + " is invalid email");
            System.out.println();
        }
        // username
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter Username to check if it is valid: ");
        str = sc.nextLine();
        if (isValidUsername(str)) {
            System.out.println(str + " is a valid Username");
        } else {
            System.out.println(str + " is not a valid Username");
        }
        // password
        for (;;) {
            String pass;
            System.out.println("Enter Password to check if it is valid: ");
            pass = sc.nextLine();
            boolean validPass = isValidPassword(pass);
            System.out.println("Password Status:" + validPass);
        }
    }
}
