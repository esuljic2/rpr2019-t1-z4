package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {

    @Test
    void getNaziv() {
        assertEquals("Neko ime", new Artikl("Neko ime", 5, "kod").getNaziv());
    }

    @Test
    void getKod() {
        assertEquals("kod", new Artikl("Neko ime", 5, "kod").getKod());
    }

    @Test
    void getCijena() {
        assertEquals(5, new Artikl("Neko ime", 5, "kod").getCijena());
    }
}