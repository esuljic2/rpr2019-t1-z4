package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {

    private List<Artikl> artikli = new ArrayList<>();

    public void dodajArtikl(Artikl artikl) {
        artikli.add(artikl);
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
}
