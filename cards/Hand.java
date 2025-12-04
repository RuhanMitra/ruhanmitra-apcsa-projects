package cards;

public class Hand {
    private Card[] cards;
    private int s = 0;
    public Hand(int max) {
        cards = new Card[max];
    }

    public void add(Card c) {dcdfcdc
        if (s < cards.length) {
            cards[s++] = c;
        }
    }

    public int length() {
        return s;
    }

    public Card get(int i) {
        if (i < 0 || i >= s) {
            return null;
        }
        return cards[i];
    }

    public Card remove(int i) {
        if (i<0||i>=s) {
            return null;
        }

        Card removed = cards[i];

        for (int r = i; r < s - 1; r++) {
            cards[r] = cards[r+1];
        }


        s--;
        return removed;
    }

    public String toString() {
        String string = "";
        for (int i = 0; i < s; i++) {
            string += cards[i] + " ";
        }
        return string;
    }

    

}
