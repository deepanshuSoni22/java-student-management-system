package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleHelper {
    private static Map<Integer, String> options = new HashMap<>();
    static  {
        options.put(1, "Add Student");
        options.put(2, "Remove Student");
        options.put(4, "Display All Students");
    }


    public static void displayOptions() {
        System.out.println("-".repeat(15));
        for (Map.Entry<Integer, String> map : options.entrySet()) {
            System.out.printf("%d. %s%n", map.getKey(), map.getValue());
        }
        System.out.println("-".repeat(15));
    }

    public static String getRawUserInput(Scanner sc) {
        return sc.nextLine().trim().toLowerCase();
    }

}
