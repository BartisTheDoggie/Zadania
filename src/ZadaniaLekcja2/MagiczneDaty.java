package ZadaniaLekcja2;

import java.util.Scanner;

public class MagiczneDaty {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj numer dnia (w formie 00): ");
        int numerDnia = keyboard.nextInt();

        System.out.println("Podaj numer miesiaca (w formie 00): ");
        int numerMiesiaca = keyboard.nextInt();


        System.out.println("Podaj dwie ostatnie cyfry roku (w formie 00): ");
        int ostatnieCyfryRoku = keyboard.nextInt();

        if (numerDnia * numerMiesiaca == ostatnieCyfryRoku) {
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
