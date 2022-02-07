class Card implements CardInterface {
	private CardFace face;

	public Card(CardFace face) {
		this.face = face;
	}

	public Image getFace() {
		return CardFace.Image();
	};

	public void setFace(Image updatedFace) {
		this.face = updatedFace;
	};
}