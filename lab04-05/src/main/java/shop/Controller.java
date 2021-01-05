package shop;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView image;

    @FXML
    public void initialize() {
        image.setImage(new Image("/your_image.jpg"));
    }
}

