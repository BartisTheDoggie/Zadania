import java.util.Scanner;

public class Plyty {
    public static void main(String[] args) {

        double marza = 0.4;

        Scanner keyboard= new Scanner(System.in);

        System.out.println("Proszę wprowadzić detaliczną cenę płytki: ");
        double detalicznaCenaPlytki = keyboard.nextDouble();

        double zysk = detalicznaCenaPlytki * marza;

        System.out.println("Zysk ze sprzedarzy płytki jest równy: " + zysk);


    }
}
