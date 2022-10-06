package ZadaniaLekcja1;

import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {

        double podatekStanowy = 0.02;
        double podatekLokalny = 0.04;


        Scanner keyboard= new Scanner(System.in);
        System.out.println("Proszę wprowadzić wartość Produktu: ");
        double wartoscProduktu = keyboard.nextInt();

        double wartoscPodatkuStanowego = (wartoscProduktu * podatekStanowy);
        double wartoscPodatkuLokalnego = (wartoscProduktu * podatekLokalny);
        double lacznaSumaProduktu = wartoscProduktu + wartoscPodatkuStanowego + wartoscPodatkuLokalnego;

        System.out.println("Wartość produktu wynosi " + wartoscProduktu + "zł");
        System.out.println("Wartość podatku stanowego wynosi " + wartoscPodatkuStanowego + "zł");
        System.out.println("Wartość podatku lokalnego wynosi " + wartoscPodatkuLokalnego + "zł");
        System.out.println("Łącznie produkt wynosi " + lacznaSumaProduktu + "zł");










    }
}
