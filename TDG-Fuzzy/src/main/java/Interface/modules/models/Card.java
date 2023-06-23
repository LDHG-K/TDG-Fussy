package Interface.modules.models;

public class Card {

    private String position;
    private String title;
    private String text;
    private String imageName;

    public Card(String position, String title, String text, String imageName) {
        this.position = position;
        this.title = title;
        this.text = text;
        this.imageName = imageName;
    }

    public String getPosition() {
        return position;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getImageName() {
        return imageName;
    }

}
