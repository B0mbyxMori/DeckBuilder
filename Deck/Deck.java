public class Deck implements DeckInterface {
        private Object back; // NOTE: Update to Back object.
        private String type;
        private byte numberOfCards;

        public Deck {
                this.back = back;
                this.type = type;
                this.numberOfCards = numberOfCards;
        }

        public void getBack();
        public void setBack();

        public void getType();
        public void setType();

        public void getNumberOfCards();
        public void setNumberOfCards();
}