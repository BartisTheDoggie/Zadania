import java.util.Scanner;

public class Sprawdzian {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Proszę wprowadzić maksymalną liczbę punktów możliwą do osiągnięcia: ");
        int maxPunkty = keyboard.nextInt();

        System.out.println("Proszę wprowadzić liczbę punktów z testu pierwszego: ");
        int test1Punkty = keyboard.nextInt();

        System.out.println("Proszę wprowadzić liczbę punktów z testu drugiego: ");
        int test2Punkty = keyboard.nextInt();

        System.out.println("Proszę wprowadzić liczbę punktów z testu trzeciego: ");
        int test3Punkty = keyboard.nextInt();

        double sredniaTestow = (test1Punkty + test2Punkty + test3Punkty) / 3;


        System.out.println("Wynik z testu pierwszego to " + test1Punkty + " na " + maxPunkty );
        System.out.println("Wynik z testu drugiego to " + test2Punkty + " na " + maxPunkty );
        System.out.println("Wynik z testu trzeciego to " + test3Punkty + " na " + maxPunkty );
        System.out.println("Średnia z testów wynosi: " + sredniaTestow );
    }
}
