package cheerfulgarden.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartWindowController {
    @FXML
    Button productButton;

    @FXML
    private void initialize(){
        productButton = new Button();
    }

    public void chooseProduct() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ProductWindow.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 350, 450));
            stage.setTitle("Веселый огород");
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void chooseStorage() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 350, 450));
            stage.setTitle("Веселый огород");
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void chooseExit() {
        System.exit(0);
    }

}
