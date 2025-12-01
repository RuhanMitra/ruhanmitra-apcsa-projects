package cards;

public class Deck {
    private Card[] cards = new Card[52];
    private int ind = 0;
    public Deck(){
        int position = 0;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 13; y++) {
                cards[position++] = new Card(x, y);
            }
        }
    }
    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int z = (int)(Math.random() * cards.length);
            Card hold = cards[i];
            cards[i] = cards[z];
            cards[z] = hold;
        }
        ind = 0;
    }
    public void cut(int n) {
        Card[] hold = new Card[52];
        int position = 0;

        for (int i = n; i < cards.length; i++) {
            hold[position++] = cards[i];
        }
        for (int i = 0; i < n; i++) {
            hold[position++] = cards[i];
        }

        cards = hold;
        ind = 0;
    }
    public Card draw() {
        if (ind>=cards.length) {
            return null;
        }
        return cards[ind++];
    }
    public void print(int r) {
        for (int i = 0; i < r; i++) {
            System.out.print(cards[i] + "    ");
        }
        System.out.println();
    }






}
