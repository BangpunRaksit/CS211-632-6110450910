package shop;

import com.github.saacsos.FXRouter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class Controller {
    @FXML
    private ImageView image;

    @FXML
    public void initialize() {
        image.setImage(new Image("/your_image.jpg"));
    }
}

