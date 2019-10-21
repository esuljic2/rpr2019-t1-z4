package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SupermarketTest {

    @Test
    void daLiRadiDodavanje() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("test", 1, "kod"));
        assertNotNull(supermarket.getArtikli()[0]);
    }
}