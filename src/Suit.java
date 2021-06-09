public enum  Suit {

    HEART("Hearts"), SPADE("Spades"), DIAMOND("Diamonds"), CLUB("Clubs");

    String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    String printSuit() {
        return suit;
    }


}
