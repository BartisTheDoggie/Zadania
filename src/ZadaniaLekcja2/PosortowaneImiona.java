package ZadaniaLekcja2;

import java.util.Scanner;

public class PosortowaneImiona {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj trzy imiona");

        System.out.println("Podaj imię pierwsze: ");
        String imie1 = keyboard.nextLine();

        System.out.println("Podaj imię drugie: ");
        String imie2 = keyboard.nextLine();

        System.out.println("Podaj imię trzecie: ");
        String imie3 = keyboard.nextLine();

        if (imie1.compareTo(imie2) > 0){
            System.out.println(imie1);
        }

        else if (imie2.compareTo(imie3) > 0) {
            System.out.println(imie1 + "" + imie2);
        }

        else if (imie1.compareTo(imie3) > 0){
            System.out.println(imie2);
        }


    }
}
