class Deck implements DeckInterface {
        private CardBack back;
        private int numberOfCards;
        private String deckName;

        public Deck(CardBack back, int numberOfCards, String deckName) {
                this.back = back;
                this.deckName = deckName;
                this.numberOfCards = numberOfCards;
        }

        public Image getBackImage(); // Will return CardBack.getImage();

        public String getDeckName();
        public void setDeckName(String deckName);

        public int getNumberOfCards();
        public void setNumberOfCards(int numberOfCards);
}