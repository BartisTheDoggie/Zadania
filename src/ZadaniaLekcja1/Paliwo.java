package ZadaniaLekcja1;

import java.util.Scanner;

public class Paliwo {
    public static void main(String[] args) {


        Scanner keyboard= new Scanner(System.in);

        System.out.println("Proszę wprowadzić liczbę przejechanych kilometrów: ");
        double liczbaKilometrow = keyboard.nextInt();


        System.out.println("Proszę wprowadzić zużyte litry paliwa: ");
        double zuzyteLitryPaliwa = keyboard.nextInt();

        double liczbaKilometrowNaLitrze = liczbaKilometrow / zuzyteLitryPaliwa;


        System.out.println("Liczba kilometrów przejechanych na litrze: " + liczbaKilometrowNaLitrze);





    }
}
