package data.flower;
import data.base.Color;
import data.base.Country;
import data.base.Odor;

public class Rosie extends Flower{
    public Rosie(Color color, int length, Odor odor, Country country, float price) {
        super(color, length, odor, country, price);
    }
    public static Rosie getRandomRose(){
        return new Rosie(getRandomColor(), getRandomLength(), getRandomOdor(), getRandomCountry(), getRandomPrice());
    }
    @Override
    public String toString() {
        return "Rose{" +
                "color=" + color +
                ", length=" + length +
                ", odor=" + odor +
                ", country=" + country+
                ", price=" + price +
                '}';
    }
}
