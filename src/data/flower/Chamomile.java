package data.flower;
import data.base.Color;
import data.base.Country;
import data.base.Odor;

public class Chamomile extends Flower{
    public Chamomile(Color color, int length, Odor odor, Country country, float price) {
        super(color, length, odor, country, price);
    }
    public static Chamomile getRandomChamomile(){
        return new Chamomile(getRandomColor(), getRandomLength(), getRandomOdor(), getRandomCountry(), getRandomPrice());
    }

    @Override
    public String toString() {
        return "Chamomile{" +
                "color=" + color +
                ", length=" + length +
                ", odor=" + odor +
                ", country=" + country+
                ", price=" + price +
                '}';
    }
}
