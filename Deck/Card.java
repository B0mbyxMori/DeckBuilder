import java.awt.Image;

class Card implements CardInterface {
	private CardFace face;
	private CardBack back;

	public Card(CardFace face, CardBack back) {
		this.face = face;
		this.back = back;
	}

	public CardFace getFace() {
		return face;
	};

	public CardBack getBack() {
		return back;
	};

	public void setFace(CardFace updatedFace) {
		this.face = updatedFace;
	};

	public void setBack(CardBack updatedBack) {
		this.back = updatedBack;
	}
}