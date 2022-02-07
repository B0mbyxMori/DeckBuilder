class Deck implements DeckInterface {
        private CardBack back;
        private int numberOfCards;
        private String deckName;

        public Deck(CardBack back, int numberOfCards, String deckName) {
                this.back = back;
                this.deckName = deckName;
                this.numberOfCards = numberOfCards;
        }

        public Image getBackImage() {
                return CardBack.getImage();
        };

        public String getDeckName() {
                return deckName;
        };

        public void setDeckName(String updatedDeckName) {
                this.deckName = updatedDeckName;
        };

        public int getNumberOfCards() {
                return numberOfCards;
        };

        public void setNumberOfCards(int updatedNumberOfCards) {
                this.numberOfCards = updatedNumberOfCards;
        };
}