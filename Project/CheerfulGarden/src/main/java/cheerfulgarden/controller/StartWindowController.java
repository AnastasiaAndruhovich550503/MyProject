package cheerfulgarden.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;

public class StartWindowController {
    @FXML
    Button productButton;

    @FXML
    Button storageButton;

    @FXML
    Button exitButton;

    @FXML
    private void initialize(){
        productButton = new Button();
        storageButton = new Button();
        exitButton = new Button();
    }

    public void chooseProduct(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/SectionWindow.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Веселый огород/Разделы");
            stage.show();

            ((Node)(event.getSource())).getScene().getWindow().hide();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void chooseStorage(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ProductWindow.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Веселый огород");
            stage.show();

            ((Node)(event.getSource())).getScene().getWindow().hide();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void chooseExit() {
        Platform.exit();
    }

}
