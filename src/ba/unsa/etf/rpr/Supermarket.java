package ba.unsa.etf.rpr;

public class Supermarket {

    private Artikl[] artikli = new Artikl[1000];
    private int brojArtikala = 0;

    public void dodajArtikl(Artikl artikl) {
        artikli[brojArtikala++] = artikl;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for (int i = 0; i < brojArtikala; i++) {
            if (artikli[i].getKod().equals(kod)) {
                Artikl a = artikli[i];
                for (int j = i; j < brojArtikala - 1; j++) {
                    artikli[j] = artikli[j + 1];
                }
                artikli[--brojArtikala] = null;
                return a;
            }
        }

        return null;
    }
}
