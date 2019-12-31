package chapter5.exam3;

public class CardCompany {
    private static CardCompany instance = new CardCompany();
    private CardCompany() {}

    public Card  createCard() {
        Card card = new Card();
        return card;
    }

    public static CardCompany getInstance() {
        return instance;
    }
}
