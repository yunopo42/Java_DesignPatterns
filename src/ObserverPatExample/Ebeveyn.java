package ObserverPatExample;

public class Ebeveyn implements Observer {
    private final String adi;

    public Ebeveyn(String adi) {
        this.adi = adi;
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof Termometre) {
            Termometre termometre = (Termometre) observable;
            System.out.println(adi + " dedi ki: 'OOoooo sıcaklık "
                    + termometre.getAnlikTemp() + " derece olmuş!'");
        }
    }
}
