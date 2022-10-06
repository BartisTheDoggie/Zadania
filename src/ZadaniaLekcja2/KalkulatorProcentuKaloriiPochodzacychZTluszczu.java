package ZadaniaLekcja2;

import java.util.Scanner;

public class KalkulatorProcentuKaloriiPochodzacychZTluszczu {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Wprowadź liczbę kalorii w produkcie: ");
        int liczbaKaloriiWProdukcie = keyboard.nextInt();

        System.out.println("Wprowadź liczbę gramów tłuszczu w produkcie: ");
        double liczbaGramTluszczuWProdukcie = keyboard.nextDouble();

        double kalorieZTluszczu = liczbaGramTluszczuWProdukcie * 9;
        double procentKalorii = kalorieZTluszczu/liczbaKaloriiWProdukcie;

        if (kalorieZTluszczu < liczbaKaloriiWProdukcie) {
            System.out.printf("Produkt jest niskotłuszczowy");
        }

        if (kalorieZTluszczu > liczbaKaloriiWProdukcie){
            System.out.printf("Dane wejściowe są nieprawidłowe");
        }


    }
}
