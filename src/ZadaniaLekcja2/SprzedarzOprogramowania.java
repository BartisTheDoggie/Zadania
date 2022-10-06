package ZadaniaLekcja2;

import java.util.Scanner;

public class SprzedarzOprogramowania {
    public static void main(String[] args) {

        int pakiet = 99;
        double rabat;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę zakupionych pakietów: ");
        int sztuki = keyboard.nextInt();


        if (sztuki >= 100) {
            System.out.println("Rabat wynosi 50%");
            double rabat1 = 0.5;
            double cenaPakietu = pakiet * rabat1;
            double lacznaCena =pakiet - cenaPakietu;
            System.out.printf("Cena z rabatem wynosi " + lacznaCena);
        }
        else if (sztuki >= 50 && sztuki <=99) {
            System.out.println("Rabat wynosi 40%");
            double rabat1 = 0.4;
            double cenaPakietu = pakiet * rabat1;
            double lacznaCena = pakiet - cenaPakietu;
            System.out.printf("Cena z rabatem wynosi " + lacznaCena);
        }
        else if (sztuki >= 20 && sztuki <=49) {
            System.out.println("Rabat wynosi 30%");
            double rabat1 = 0.3;
            double cenaPakietu = pakiet * rabat1;
            double lacznaCena = pakiet - cenaPakietu;
            System.out.printf("Cena z rabatem wynosi " + lacznaCena);
        }
        else if (sztuki >= 10 && sztuki <= 19) {
            System.out.println("Rabat wynosi 20%");
            double rabat1 = 0.2;
            double cenaPakietu = pakiet * rabat1;
            double lacznaCena = pakiet - cenaPakietu;
            System.out.printf("Cena z rabatem wynosi " + lacznaCena);
        }
        else {
            System.out.println("BŁĄD 404" );
        }
    }
}
