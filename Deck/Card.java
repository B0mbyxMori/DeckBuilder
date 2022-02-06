class Card implements CardInterface {
	private CardFace face;

	public Card(CardFace face) {
		this.face = face;
	}

	public Image getFace(); // Will return CardFace.getImage();
	public void setFace(Image face);
}