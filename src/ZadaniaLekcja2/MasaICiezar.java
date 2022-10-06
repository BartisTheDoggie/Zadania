package ZadaniaLekcja2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MasaICiezar {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj masę obiektu: ");
        int masaObiektu = keyboard.nextInt();

        double ciezar;
        ciezar = masaObiektu * 9.8;

        BigDecimal bd1 = new BigDecimal(ciezar).setScale(1, RoundingMode.HALF_UP);
        double ciezarv1 = bd1.doubleValue();

        if (masaObiektu >= 1000) {
            System.out.printf("Obiekt jest za ciężki");
        }
        else if (masaObiektu <= 10) {
            System.out.printf("Obiekt jest za lekki");
        }
        else {
            System.out.printf("Ciężar obiektu wynosi: " + ciezarv1);


        }
    }
}
