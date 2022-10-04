public class Akcje {
    public static void main(String[] args) {

        double cenaAkcji = 21.77;
        int liczbaAkcji = 600;
        double prowizjaZaTranzakcje = 0.02;
        double ileZaplacilaZaAkcje = cenaAkcji * liczbaAkcji;
        double ileZaplacilaZaAkcjePLUSprowizja = ileZaplacilaZaAkcje * prowizjaZaTranzakcje;
        double lacznaKwota = ileZaplacilaZaAkcje + ileZaplacilaZaAkcjePLUSprowizja;

        System.out.println("Kwota zapłacona za same akcje: " + ileZaplacilaZaAkcje);
        System.out.println("Wysokość prowizji: " + ileZaplacilaZaAkcjePLUSprowizja);
        System.out.println("Łączna zapłacona kwota: " + lacznaKwota);


    }
}
