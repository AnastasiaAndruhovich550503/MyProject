package cheerfulgarden.controller;

import cheerfulgarden.entity.Product;
import cheerfulgarden.session.SessionCreator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class ApplicationController {
    @FXML
    TableView<Product> tableView;
    @FXML
    TableColumn<Product, String> firstNameColumn;
    @FXML
    TableColumn<Product, String> lastNameColumn;

    ObservableList<Product> listUsers = FXCollections.observableArrayList();
    // realize singleton if someone else will open the session
    private final SessionCreator sessionCreator = SessionCreator.getInstance();

    @FXML
    private void initialize(){
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("lastName"));
        tableView.setItems(listUsers);
    }

    public void loadData(){
        listUsers.addAll(sessionCreator.createCriteria(Product.class).list());

    }
}
