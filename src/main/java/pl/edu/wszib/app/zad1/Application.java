package pl.edu.wszib.app.zad1;

public class Application {
    public static void main(String[] args) {
        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA
        );
        koktajlTruskawkowy.pij();
        koktajlTruskawkowy.jedz();
        RodzajTruskawki rodzajTruskawki = RodzajTruskawki.ANANASOWA;

        String opis = switch (rodzajTruskawki) {
            case ANANASOWA -> {
                yield "opis";
            }
            case KENT -> "opis";
            case POLKA -> {
                yield "opis";
            }
            case CHRISTINE -> {
                yield "opis";
            }
            case HONEOYE -> {
                yield "opis";
            }
        };
    }
}
