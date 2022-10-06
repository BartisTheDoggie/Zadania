package ZadaniaLekcja2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SzybkoscDzwieku {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int predkoscWPowietrzu = 343;
        int predkoscWWodzie = 1490;
        int predkoscWStali = 5100;

        String powietrze = "powietrze";
        String woda = "woda";
        String stal = "stal";

        System.out.println("Proszę wprowadzić słowo: 'powierze', 'woda' albo 'stal' ");
        String osrodek = keyboard.nextLine();

        System.out.println("Wybrany ośrodek to " + osrodek);

        System.out.println("Jaką odległość fala ma przebyć w tym ośrodku?");
        double odleglosc = keyboard.nextDouble();

        System.out.println("Trwa obliczanie...");

        if (powietrze.compareTo(osrodek) == 0){
            double czas = (odleglosc/predkoscWPowietrzu);
            BigDecimal bd = new BigDecimal(czas).setScale(1, RoundingMode.HALF_UP);
            double czasZaokraglony = bd.doubleValue();
            System.out.println("Czas w jakim fala przebędzie odległość równą " + odleglosc + "m w ośrodku " + osrodek + ", wynosi " + czasZaokraglony + "s");
        }
        else if (woda.compareTo(osrodek) == 0) {
            double czas = (odleglosc / predkoscWWodzie);
            BigDecimal bd = new BigDecimal(czas).setScale(1, RoundingMode.HALF_UP);
            double czasZaokraglony = bd.doubleValue();
            System.out.println("Czas w jakim fala przebędzie odległość równą " + odleglosc + "m w ośrodku " + osrodek + ", wynosi " + czasZaokraglony + "s");
        }
        else if (stal.compareTo(osrodek) == 0) {
            double czas = (odleglosc / predkoscWStali);
            BigDecimal bd = new BigDecimal(czas).setScale(1, RoundingMode.HALF_UP);
            double czasZaokraglony = bd.doubleValue();
            System.out.println("Czas w jakim fala przebędzie odległość równą " + odleglosc + "m w ośrodku " + osrodek + ", wynosi " + czasZaokraglony + "s");

        }


    }
}
