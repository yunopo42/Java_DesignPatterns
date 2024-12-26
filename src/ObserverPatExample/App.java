package ObserverPatExample;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);

        Termometre termometre = new Termometre(BigDecimal.valueOf(25), minSicaklik, maxSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        termometre.addObserver(anne);
        termometre.addObserver(baba);

        // Sıcaklık artırma
        for (int i = termometre.getAnlikTemp().intValue(); i <= 30; i++) {
            termometre.setAnlikTemp(BigDecimal.valueOf(i));
        }

        // Sıcaklık azaltma
        for (int i = termometre.getAnlikTemp().intValue(); i >= 22; i--) {
            termometre.setAnlikTemp(BigDecimal.valueOf(i));
        }
    }
}
