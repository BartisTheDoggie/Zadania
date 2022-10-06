package ZadaniaLekcja2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class WynikiTestowIOceny {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int maxPunkty = 100;
        final int liczbaTestow = 3;

        System.out.println("Podaj wynik z testu pierwszego: ");
        double wynik1 = keyboard.nextDouble();

        System.out.println("Podaj wynik z testu drugiego: ");
        double wynik2 = keyboard.nextDouble();

        System.out.println("Podaj wynik z testu trzeciego: ");
        double wynik3 = keyboard.nextDouble();

        double srednia1 = (wynik1 / maxPunkty) * 100;
        double srednia2 = (wynik2 / maxPunkty) * 100;
        double srednia3 = (wynik3 / maxPunkty) * 100;

        BigDecimal bd1 = new BigDecimal(srednia1).setScale(0, RoundingMode.HALF_UP);
        double sredniaZaokroglona1 = bd1.doubleValue();

        BigDecimal bd2 = new BigDecimal(srednia2).setScale(0, RoundingMode.HALF_UP);
        double sredniaZaokroglona2 = bd2.doubleValue();

        BigDecimal bd3 = new BigDecimal(srednia3).setScale(0, RoundingMode.HALF_UP);
        double sredniaZaokroglona3 = bd3.doubleValue();

        int sredniaCalosciowa = (int) ((sredniaZaokroglona1 + sredniaZaokroglona2 + sredniaZaokroglona3) / liczbaTestow);

        System.out.println(sredniaZaokroglona1);
        System.out.println(sredniaZaokroglona2);
        System.out.println(sredniaZaokroglona3);
        System.out.println(sredniaCalosciowa);


        if (sredniaCalosciowa >= 90 && sredniaCalosciowa <=100) {
            System.out.println("Ocena bardzo dobra");
        }
        else if (sredniaCalosciowa >= 80 && sredniaCalosciowa <=89) {
            System.out.println("Ocena dobra");
        }
        else if (sredniaCalosciowa >= 70 && sredniaCalosciowa <=79) {
            System.out.println("Ocena dostateczna");
        }
        else if (sredniaCalosciowa >= 60 && sredniaCalosciowa <= 69) {
            System.out.println("Ocena dopuszczająca");
        }
        else if (sredniaCalosciowa <= 59 && sredniaCalosciowa >=0) {
            System.out.println("Ocena niedostateczna");
        }
        else {
            System.out.println("BŁĄD 404" );
        }




    }
}
