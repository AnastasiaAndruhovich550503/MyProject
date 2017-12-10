package CheerfulGarden.Controllers;

import CheerfulGarden.entity.Product;
import CheerfulGarden.persistance.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.Session;



public class ApplicationController {
    @FXML
    TableView<Product> tableView;
    @FXML
    TableColumn<Product, String> firstNameColumn;
    @FXML
    TableColumn<Product, String> lastNameColumn;

    ObservableList<Product> listUsers = FXCollections.observableArrayList();
    private final Session session = HibernateUtil.getSessionFactory().openSession(); // realize singleton if someone else will open the session

    @FXML
    private void initialize(){
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("lastName"));
        tableView.setItems(listUsers);
    }

    public void loadData(){

        listUsers.addAll(session.createCriteria(Product.class).list());

    }
}
