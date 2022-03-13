interface DeckInterface {
	CardBack getBack();

	String getDeckName();
	void setDeckName(String updatedDeckName);

	double getNumberOfCards();
	void setNumberOfCards(double updatedNumberOfCards);
}