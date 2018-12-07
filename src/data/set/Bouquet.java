package data.set;

import data.base.Color;
import data.base.Country;
import data.base.Odor;
import data.flower.Chamomile;
import data.flower.Flower;
import data.flower.Tulip;
import data.flower.Rosie;


import java.util.LinkedList;
import java.util.List;


public class Bouquet extends FlowerList{
    public Bouquet() {
        super();
    }

    public Bouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet getRandomBouquet() {
        int count = (random.nextInt(2) + 1) * 10 + 1;
        List<Flower> flowers = new LinkedList<>();
        for(int i = 0; i < count; i++) {

            int flowerType = random.nextInt(3);

            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
            Odor odor = Flower.getRandomOdor();
            Country country = Flower.getRandomCountry();

            switch (flowerType) {
                case 0: flowers.add(new Rosie(color, length, odor, country, price)); break;
                case 1: flowers.add(new Chamomile(color, length, odor, country, price)); break;
                case 2: flowers.add(new Tulip(color, length, odor, country, price)); break;
            }
        }

        return new Bouquet(flowers);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }
}
