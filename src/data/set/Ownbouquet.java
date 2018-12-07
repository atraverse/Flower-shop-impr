package data.set;

import data.base.Color;
import data.base.Country;
import data.base.Odor;
import data.flower.Chamomile;
import data.flower.Flower;
import data.flower.Rosie;
import data.flower.Tulip;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Ownbouquet extends FlowerList{
    public Ownbouquet() {
        super();
    }
    public Ownbouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Ownbouquet ownBouquet(){
        float total_price = 0;
        List<Flower> flowers = new LinkedList<>();
        System.out.println("Enter number of Rose(1, 2, ..): ");
        Scanner sc = new Scanner(System.in);
        int rose = sc.nextInt();
        System.out.println("Enter number of Tulip(1, 2, ..): ");
        Scanner sc1 = new Scanner(System.in);
        int tulip = sc1.nextInt();
        System.out.println("Enter number of Chamomile(1, 2, ..): ");
        Scanner sc2 = new Scanner(System.in);
        int chamomile = sc2.nextInt();


        for(int i =0; i<=rose; i++){
            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
            Odor odor = Flower.getRandomOdor();
            Country country = Flower.getRandomCountry();
            total_price = total_price + price*rose;
            flowers.add(new Rosie(color, length, odor, country, price));
        }
        for(int i =0; i<=tulip; i++){
            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
            Odor odor = Flower.getRandomOdor();
            Country country = Flower.getRandomCountry();
            total_price = total_price + price*tulip;
            flowers.add(new Tulip(color, length, odor, country, price));
        }
        for(int i =0; i<=chamomile; i++){
            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
            Odor odor = Flower.getRandomOdor();
            Country country = Flower.getRandomCountry();
            total_price = total_price + price*chamomile;
            flowers.add(new Chamomile(color, length, odor, country, price));
        }
        System.out.println("Total price: " + total_price);
        return new Ownbouquet(flowers);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }
}
