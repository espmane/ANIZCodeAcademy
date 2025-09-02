package Lesson04.Dato;

import java.util.Scanner;

public class DatoTest {
    public static void main(String[] args) {

        Dato hackerMane = new Dato(2, 9, 2025);

        Scanner input = new Scanner(System.in);

        System.out.print("Er du Amerikaner (fat burger loving fuck)?(y/n) : ");
        String nationalitet = input.next();

        if (nationalitet.equals("y")) {
            System.out.println("Amerikansk dato: " + hackerMane.convert(false));
        } else {
            System.out.println("Europæisk dato: " + hackerMane.convert(true));
        }

/*
        System.out.println("Amerikansk dato: " + hackerMane.convert(true) +
                "\nEuropæisk dato: " + hackerMane.convert(false));
                */
    }
}


