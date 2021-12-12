package CustomMenuApp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LoginUtils {
    HashMap<String, String> users = new HashMap<String, String>();
    BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    public void loginMethod() {
        boolean lState = false;
        String userName = "", userPassword = "";
        users.put("admin", "admin");
        users.put("abc", "abc");
        users.put("elsa", "elsa");


        System.out.println("--------- Console Program Check ---------------------");

        do {
            System.out.print("Please enter your user name:");
            try {

                userName = consoleReader.readLine();
                if (users.containsKey(userName)) {
                    try {
                        System.out.println();
                        System.out.print("Password: ");
                        userPassword = consoleReader.readLine();
                        if (users.get(userName).equals(userPassword)) {
                            lState = true;
                        } else System.out.println("Invalid user or password. Please try again!");

                    } catch (Exception e) {

                        System.out.println("Error!");
                        lState = false;
                    }

                } else System.out.println("Invalid user or password. Please try again!");
            } catch (Exception e) {

                System.out.println("Error!");
                lState = false;
            }

        } while (!lState);

        System.out.println(">>> Logged in  : " + userName + " >>>>");
    }

}
