class Deck implements DeckInterface {
        private CardBack back;
        private double numberOfCards;
        private String deckName;

        public Deck(CardBack back, int numberOfCards, String deckName) {
                this.back = back;
                this.deckName = deckName;
                this.numberOfCards = numberOfCards;
        }

        public CardBack getBack() {
                return back;
        };

        public String getDeckName() {
                return deckName;
        };

        public void setDeckName(String updatedDeckName) {
                this.deckName = updatedDeckName;
        };

        public double getNumberOfCards() {
                return numberOfCards;
        };

        public void setNumberOfCards(double updatedNumberOfCards) {
                this.numberOfCards = updatedNumberOfCards;
        };
}