package org.yup.neighborhoodlibrary;

import java.util.Scanner;

public class Screens {

    public static int mainMenuPrompt() {

        // show the menu
        System.out.println("What would you like to do?");
        System.out.println("1 |   Show Available Books");
        System.out.println("2 |   Show Checked Out Books");
        System.out.println("3 |   Exit");

        // make a scanner that captures user input
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

}
