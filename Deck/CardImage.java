import java.awt.Image;

class CardImage implements CardImageInterface {
	private Image image;

	public CardImage(Image image) {
		this.image = image;
	}

	public Image getImage() {
		return image;
	};

	public void setImage(Image updatedImage) {
		this.image = updatedImage;
	};
}