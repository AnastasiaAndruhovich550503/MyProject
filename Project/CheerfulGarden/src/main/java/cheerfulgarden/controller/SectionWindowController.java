package cheerfulgarden.controller;

import cheerfulgarden.session.SessionCreator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class SectionWindowController {
    @FXML
    TableView<String> sectionList;

    @FXML
    TableColumn<String, String> sectionColumn;

    @FXML
    Button addSectionButton;

    @FXML
    Button removeSectionButton;

    @FXML
    Button backButton;

    ObservableList<String> sections = FXCollections.observableArrayList();
    private final SessionCreator sessionCreator = SessionCreator.getInstance();

    @FXML
    private void initialize(){
        addSectionButton = new Button();
        removeSectionButton = new Button();
        backButton = new Button();
        sectionList.setItems(sections);
    }

    public void back() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/StartWindow.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Веселый огород");
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
 }
