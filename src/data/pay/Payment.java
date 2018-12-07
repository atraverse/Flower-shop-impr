package data.pay;

public abstract class Payment {
    Card card;
    Cash cash;
    public Card  getCard() {
        return card;
    }
    public Cash getcash() {
        return cash;
    }
}
