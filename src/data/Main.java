package data;

import data.flower.Rosie;
import data.flower.Chamomile;
import data.flower.Tulip;
import data.set.Bouquet;
import data.set.Ownbouquet;

import java.util.Scanner;
//Write a Flower Shop:
//
//1) The store sells various types of flowers (Rosie, Chamomile, Tulip, etc.)
//
//2) Each flower has a set of parameters (color, length of the stem, odor, country of origin, price)
//
//3) Can also specify an attribute (for example: Rose - the presence of spikes)
//
//4) From flowers it is possible to make bouquets
//
//5) Also in the store and immediately there are already formed, default bouquets)
//
//6) A user can buy an already formed bouquet, or to form his (the price of a bouquet
// - the sum of the price of flowers which it includes)
public class Main {
    public static void main(String[] args) {
        System.out.println("Do you want to buy 1)formed bouquet or 2)form own?(enter 1 or 2)");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i==1){
            System.out.println("Already formed bouquet: ");
            Rosie rose = Rosie.getRandomRose();
            System.out.println(rose);

            Chamomile chamomile = Chamomile.getRandomChamomile();
            System.out.println(chamomile);

            Tulip tulip = Tulip.getRandomTulip();
            System.out.println(tulip);

            Bouquet bouquet = Bouquet.getRandomBouquet();
            System.out.println(bouquet);
        }
        else{
            Ownbouquet bouquet = Ownbouquet.ownBouquet();
            System.out.println(bouquet);
        }
        System.out.println("Choose way for pay: 1) cash 2) card:");
        Scanner p = new Scanner(System.in);
        int i1 = p.nextInt();
        if(i1 == 1){
            System.out.println("Thank you for your choosing");

        }
        else{
            System.out.println("Thank you for your choosing");
        }

    }
}
