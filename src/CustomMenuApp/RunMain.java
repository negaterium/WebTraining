package CustomMenuApp;

import java.util.ArrayList;
import java.util.List;

import com.company.*;

public class RunMain {
    List<String> mainMenu = new ArrayList<>();
    List<String> mathOpMenu = new ArrayList<>();
    DisplayUtils dUtil = new DisplayUtils();
    ReadFromKeyboard iUtil = new ReadFromKeyboard();
    Calculator cUtil = new Calculator();
    Sleep sUtil = new Sleep();
    LoginUtils logUtil = new LoginUtils();
    int choice, subMenuChoice;

    public void createMainMenu() {
        mainMenu.add("1. Operatii matematice");
        mainMenu.add("2. Operatii logice");
        mainMenu.add("3. Sortare");
        mainMenu.add("0. Exit");
    }

    public void createMathOpMenu() {
        mathOpMenu.add("1. Adunare");
        mathOpMenu.add("3. Inmultire");
        mathOpMenu.add("4. Impartire");
        mathOpMenu.add("0. Exit");
    }

    public void mathOpMenuCheck() {
        int n1, n2;
        dUtil.clearConsole();
        dUtil.displayMenu(mathOpMenu);
        subMenuChoice = iUtil.getInt();
        while (subMenuChoice != 0) {

            switch (subMenuChoice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter first number:");
                    n1 = iUtil.getInt();
                    System.out.print("Enter second number:");
                    n2 = iUtil.getInt();
                    System.out.println("Rezultatul adunarii este:" + cUtil.sumTwoNumbers(n1, n2));
                    sUtil.waitFor(2);
                case 2:
                    System.out.print("Enter first number:");
                    n1 = iUtil.getInt();
                    System.out.print("Enter second number:");
                    n2 = iUtil.getInt();
                    System.out.println("Rezultatul inmultirii este:" + cUtil.multiplyTwoNumbers(n1, n2));
                    sUtil.waitFor(2);
            }
            dUtil.clearConsole();
            dUtil.displayMenu(mathOpMenu);
            subMenuChoice = iUtil.getInt();
        }
    }

    public void runMainLoop() {
        createMainMenu();
        logUtil.loginMethod();
        dUtil.clearConsole();
        dUtil.displayMenu(mainMenu);
        choice = iUtil.getInt();
        while (choice != 0) {

            switch (choice) {
                case 0:
                    break;
                case 1:
                    createMathOpMenu();
                    mathOpMenuCheck();
            }
            dUtil.clearConsole();
            dUtil.displayMenu(mainMenu);
            choice = iUtil.getInt();
        }

    }

}
