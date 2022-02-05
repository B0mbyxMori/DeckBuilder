class Deck implements DeckInterface {
        private CardBack back;
        private String type;
        private byte numberOfCards;

        public Deck {
                this.back = back;
                this.type = type;
                this.numberOfCards = numberOfCards;
        }

        public void getBack(); // Will return CardBack.getImage();

        public void getType();
        public void setType();

        public void getNumberOfCards();
        public void setNumberOfCards();
}