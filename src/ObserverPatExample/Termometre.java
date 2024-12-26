package ObserverPatExample;

import java.math.BigDecimal;

public class Termometre extends Observable {
    private BigDecimal anlikTemp;
    private final BigDecimal minTemp;
    private final BigDecimal maxTemp;

    public Termometre(BigDecimal anlikTemp, BigDecimal minTemp, BigDecimal maxTemp) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.anlikTemp = anlikTemp; // Gelen sıcaklık değeri ile başlatılır
    }

    public BigDecimal getAnlikTemp() {
        return anlikTemp;
    }

    public void setAnlikTemp(BigDecimal anlikTemp) {
        this.anlikTemp = anlikTemp;
        System.out.println("Anlık sıcaklık: " + anlikTemp);
        controlTheTemp();
    }

    private void controlTheTemp() {
        boolean isCokSicak = anlikTemp.compareTo(maxTemp) >= 0;
        boolean isCokSoguk = anlikTemp.compareTo(minTemp) <= 0;

        if (isCokSicak || isCokSoguk) {
            notifyObservers();
        }
    }
}
