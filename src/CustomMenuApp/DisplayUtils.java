package CustomMenuApp;

import java.util.List;

public class DisplayUtils {
    public void displayMenu(List<String> menuList) {
        System.out.println("--------------------");
        for (String i:menuList)
            System.out.println(i);
        System.out.println("--------------------");
    }

    public void clearConsole() {
        for (int i=0; i < 20; i++) System.out.println();
    }
}
