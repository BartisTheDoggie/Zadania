import java.util.Scanner;

public class PrzepisNaCiasteczka {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        double cukierNa1Ciastko = 1.5 / 48;
        int masloNa1Ciastko = 1 / 48;
        double makaNa1Ciastko = 2.75 / 48;

        System.out.println("Ile chcesz upiec ciasteczek?: ");
        double liczbaCiastekDoUpieczenia = keyboard.nextDouble();

        double cukierNaxCiastek = cukierNa1Ciastko * liczbaCiastekDoUpieczenia;
        double masloNaxCiastek = masloNa1Ciastko * liczbaCiastekDoUpieczenia;
        double makaNaxCiastek = makaNa1Ciastko * liczbaCiastekDoUpieczenia;
    }
}
