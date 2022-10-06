package ZadaniaLekcja2;

import java.util.Scanner;

public class OplatyZaTransport {
    public static void main(String[] args) {;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj wagę (w kilogramach): ");
        int waga = keyboard.nextInt();

        System.out.println("Podaj odleglość przesyłki: ");
        int odleglosc = keyboard.nextInt();


        if (waga <= 1) {
            double cena1 = 1.10;
            System.out.println("Koszt przesyłki wynosi " + cena1);
        } else if (waga > 1 && waga <= 3) {
            double cena1 = 2.20;
            System.out.println("Koszt przesyłki wynosi " + cena1);
        } else if (waga > 3 && waga <= 5) {
            double cena1 = 3.70;
            System.out.println("Koszt przesyłki wynosi " + cena1);
        } else if (waga > 5) {
            double cena1 = 3.80;
            System.out.println("Koszt przesyłki wynosi " + cena1);
        }
        else {
                System.out.println("BŁĄD 404");
            }
        }
    }
