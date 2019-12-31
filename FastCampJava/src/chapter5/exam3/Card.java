package chapter5.exam3;

public class Card {

    private static int serialNumber = 10001;
    private int cardNumber;
    public Card() {
        cardNumber = serialNumber;
        serialNumber++;
    }


    public int getCardNumber() {
        return cardNumber;
    }
}
