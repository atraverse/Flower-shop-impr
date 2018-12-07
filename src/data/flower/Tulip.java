package data.flower;
import data.base.Color;
import data.base.Country;
import data.base.Odor;

//2) Each flower has a set of parameters (color, length of the stem, odor, country of origin, price)
public class Tulip extends Flower{
    public Tulip(Color color, int length, Odor odor, Country country, float price) {
        super(color, length, odor, country, price);
    }
    public static Tulip getRandomTulip(){
        return new Tulip(getRandomColor(), getRandomLength(), getRandomOdor(), getRandomCountry(), getRandomPrice());
    }
    @Override
    public String toString() {
        return "Tulip{" +
                "color=" + color +
                ", length=" + length +
                ", odor=" + odor +
                ", country=" + country+
                ", price=" + price +
                '}';
    }
}
