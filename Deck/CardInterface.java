import java.awt.Image;

interface CardInterface {
	CardFace getFace();
	CardBack getBack();
	void setFace(CardFace face);
	void setBack(CardBack back);
}