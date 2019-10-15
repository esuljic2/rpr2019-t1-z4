package ba.unsa.etf.rpr;

class Artikl {

    private String name;
    private int price;
    private String code;

    Artikl(String name, int price, String code) {
        this.name = name;
        this.price = price;
        this.code = code;
    }

    String getNaziv() {
        return name;
    }

    String getKod() {
        return code;
    }

    int getCijena() {
        return price;
    }
}