package Pac_Man;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Log_In_Page implements Initializable {

    @FXML
    private ImageView pacman;

    @FXML
    private Button registrationbutton;

    private Scene scene;
    private Stage stage;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        //translate pacman
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(pacman);
        translate.setDuration(Duration.millis(4000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(450);
        translate.play();
    }

    public void switchToRegistrationPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Registration-Page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}