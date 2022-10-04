import java.util.Scanner;

public class JedzZdrowo {
    public static void main(String[] args) {

        int liczbaCiastek = 40;
        int liczbaPorcji = 10;
        int kaloriiNaPorcje = 300;
        int liczbaCiastekWPorcji = liczbaCiastek / liczbaPorcji;
        int kaloriiWCiastku = kaloriiNaPorcje / liczbaCiastekWPorcji;



                Scanner keyboard= new Scanner(System.in);
        System.out.println("Proszę wprowadzić liczbę zjedzonych ciasteczek: ");
        int liczbaZjedzonychCiasteczek = keyboard.nextInt();
        int wynik = liczbaZjedzonychCiasteczek * kaloriiWCiastku;


        System.out.println("Zjadł*ś " + liczbaZjedzonychCiasteczek + " ciastek, to znaczy, że skonsumowałeś " + wynik + " kalorii" );




    }
}
