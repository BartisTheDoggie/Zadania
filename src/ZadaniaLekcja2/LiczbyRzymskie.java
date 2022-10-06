package ZadaniaLekcja2;

import java.util.Scanner;

public class LiczbyRzymskie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj odpowiedz (a,b,c)");
        String answer = scan.nextLine().toLowerCase();

        int liczba = 1;
        switch (liczba) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("Luty");
            case 3 -> System.out.println("Marzec");
            default -> System.out.println("Nieoczekiwany błąd. Kod błędu nieznany");
        }
        System.out.println("Za chwilę dalszy ciąg programu...");
    }

}


