package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Korpa {

    private List<Artikl> artikli = new ArrayList<>();

    public boolean dodajArtikl(Artikl a) {
        if (artikli.size() >= 50)
            return false;

        artikli.add(a);
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli.toArray(new Artikl[artikli.size()]);
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (Artikl artikl : artikli)
            if (artikl.getKod().equals(kod)) {
                artikli.remove(artikl);
                return artikl;
            }

        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int sum = 0;
        for (Artikl artikl : artikli)
            sum += artikl.getCijena();

        return sum;
    }
}
