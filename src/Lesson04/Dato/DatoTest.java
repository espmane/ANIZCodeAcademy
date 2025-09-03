package Lesson04.Dato;

import java.util.Scanner;

public class DatoTest {
    public static void main(String[] args) {

        Dato dagsDato = new Dato(2, 9, 2025);

        Scanner input = new Scanner(System.in);

        System.out.print("Er du Amerikaner? (y/n) : ");
        String nationalitet = input.next();

        if (nationalitet.equals("y")) {
            System.out.println("Amerikansk dato: " + dagsDato.convert(false));
        } else {
            System.out.println("Europæisk dato: " + dagsDato.convert(true));
        }

/*
        System.out.println("Amerikansk dato: " + hackerMane.convert(true) +
                "\nEuropæisk dato: " + hackerMane.convert(false));
*/
    }
}