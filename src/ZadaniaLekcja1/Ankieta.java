package ZadaniaLekcja1;

public class Ankieta {
    public static void main(String[] args) {
        int ankietowani = 12467;
        double procentOsobKupujacychJednegoEnergolaTygodniowo = 0.14;
        double procentOsobPreferujacychCytrusoweEnergole = 0.64;

        int liczbaOsobKupujacychJednegoEnergolaTygodniowo = (int) (ankietowani * procentOsobKupujacychJednegoEnergolaTygodniowo);
        int liczbaOsobPreferujacychCytrusoweEnergole = (int) (ankietowani * procentOsobPreferujacychCytrusoweEnergole);

        System.out.println("Przybliżona liczba osób kupujących jednego energola tygodniowo: " + liczbaOsobKupujacychJednegoEnergolaTygodniowo);
        System.out.println("Przybliżona liczba osób preferujące cytrusowe energole: " + liczbaOsobPreferujacychCytrusoweEnergole);
    }
}
