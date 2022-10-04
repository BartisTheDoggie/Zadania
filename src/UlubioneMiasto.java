import java.util.Scanner;

public class UlubioneMiasto {
    public static void main(String[] args) {

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Wprowadź nazwę swojego ulubionego miasta: ");
        String ulubioneMiasto = keyboard.nextLine();

        int dlugoscMiasta = ulubioneMiasto.length();

        String duze, male;

        duze = ulubioneMiasto.toUpperCase();
        male = ulubioneMiasto.toLowerCase();

        char pierwszaLitera = ulubioneMiasto.charAt(0);

        System.out.println("Liczba liter w twoim ulubionym mieście: " + dlugoscMiasta);
        System.out.println("Miasto pisane dużymi literami: " + duze);
        System.out.println("Miasto pisane małymi literami: " + male);
        System.out.println("Pierwsza litera w mieście: " + pierwszaLitera);


    }
}
