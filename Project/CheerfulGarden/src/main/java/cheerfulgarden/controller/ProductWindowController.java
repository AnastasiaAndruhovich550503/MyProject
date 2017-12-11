package cheerfulgarden.controller;

import cheerfulgarden.entity.Product;
import cheerfulgarden.session.SessionCreator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProductWindowController {
    @FXML
    TableView<Product> productList;

    @FXML
    TableColumn<Product, String> columnName;

    @FXML
    TableColumn<Product, String> columnYear;

    @FXML
    TableColumn<Product, String> columnVolume;

    @FXML
    TableColumn<Product, String> columnQuantity;

    @FXML
    TableColumn<Product, String> columnStorage;

    @FXML
    TableColumn<Product, String> columnDescription;

    private final SessionCreator sessionCreator = SessionCreator.getInstance();
    ObservableList<Product> products = FXCollections.observableArrayList();

    @FXML
    private void initialize(){
        productList.setItems(products);
        products.addAll(sessionCreator.createCriteria(Product.class).list());
    }


}
