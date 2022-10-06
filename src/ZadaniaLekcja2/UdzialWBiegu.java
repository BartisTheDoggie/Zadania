package ZadaniaLekcja2;

import java.util.Scanner;

public class UdzialWBiegu {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Proszę o wprowadzenie nazwisk 3 biegaczy oraz czasu w minutach");

        System.out.println("Nazwisko pierwsze");
        String nazwiskoPierwsze = keyboard.nextLine();

        System.out.println("Czas pierwszego biegacza");
        double czasBiegacza1 = keyboard.nextDouble();
        keyboard.nextLine();


        System.out.println("Nazwisko drugie");
        String nazwiskoDrugie = keyboard.nextLine();

        System.out.println("Czas drugiego biegacza");
        double czasBiegacza2 = keyboard.nextDouble();
        keyboard.nextLine();


        System.out.println("Nazwisko trzecie");
        String nazwiskoTrzecie = keyboard.nextLine();

        System.out.println("Czas trzeciego biegacza");
        double czasBiegacza3 = keyboard.nextDouble();
        keyboard.nextLine();

        if (czasBiegacza1 < czasBiegacza2 && czasBiegacza1 < czasBiegacza3){
            System.out.println(nazwiskoPierwsze);
        }
        else if (czasBiegacza2 < czasBiegacza1 && czasBiegacza2 < czasBiegacza3) {
            System.out.println(nazwiskoDrugie);
        }
        else if (czasBiegacza3 < czasBiegacza1 && czasBiegacza3 < czasBiegacza2) {
            System.out.println(nazwiskoTrzecie);
        }
        else if (czasBiegacza1 == czasBiegacza2 && czasBiegacza1 == czasBiegacza3 && czasBiegacza2 == czasBiegacza3) {
            System.out.println("Niemożliwe! Wszyscy biegacze dobiegli do mety w tym samym czasie!");
        }


    }
}
