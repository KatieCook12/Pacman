package Pac_Man;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Registration_Page {

    private Scene scene;
    private Stage stage;

    public void switchToLogInPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Log-In-Page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
