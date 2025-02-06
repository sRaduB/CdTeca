package CdTeca_Remastered;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Autore garga = new Autore("Cristian", "Gargano", LocalDate.of(2006, 10, 29));
        Autore radu = new Autore("Radu", "Bostan", LocalDate.of(2006, 8, 18));

        Cd kalabria = new Cd("Kalabria", garga, 10, 82.3);
        Cd kisinau = new Cd("Kisinau", radu, 12, 69.3);

        CdTeca teca = new CdTeca();

        teca.aggiungiCd(kisinau);
        teca.aggiungiCd(kalabria);

        System.out.println(teca.durataTotale());
        System.out.println(teca.numeroBraniTotale());
        System.out.println(teca.mediaDuarataBrani());
        System.out.println(teca.cdPiuCorto());
    }
}
