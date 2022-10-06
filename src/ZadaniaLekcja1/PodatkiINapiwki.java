package ZadaniaLekcja1;

import java.util.Scanner;

public class PodatkiINapiwki {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        double podatek = 0.0675;
        double napiwek = 0.2;

        System.out.println("Wprowadź cenę posiłku: ");
        double cenaPosilku = keyboard.nextDouble();

        double wartoscPodatku = cenaPosilku * podatek;
        double wartoscNapiwku = cenaPosilku * napiwek;

        double suma = cenaPosilku + wartoscPodatku + wartoscNapiwku;

        System.out.println("Cena posiłku wynosi: " + cenaPosilku);
        System.out.println("Wartość podatku wynosi: " + wartoscPodatku);
        System.out.println("Wartość napiwku wynosi: " + wartoscNapiwku);
        System.out.println("Lączna wartość do zapłaty wynosi: " + suma);

    }
}
