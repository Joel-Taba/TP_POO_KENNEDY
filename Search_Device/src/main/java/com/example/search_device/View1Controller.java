package com.example.search_device;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.Initializable;
import com.example.search_device.Delete_Device;
import java.io.IOException;
import com.example.search_device.View4Controller;
import java.sql.*;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class View1Controller implements Initializable {

    @FXML
    private TableView<Victime> tableView;

    @FXML
    private TableColumn<Victime, Void> ActionPossibleCol;

    @FXML
    private Button AddButton;

    @FXML
    private TableColumn<Victime, String> EmailCol;

    @FXML
    private TableColumn<Victime, String> DatePerteCol;

    @FXML
    private Button DeleteButton;

    @FXML
    private TableColumn<Victime, String> MarqueCol;

    @FXML
    private TableColumn<Victime, String> NomProprioCol;

    @FXML
    private TableColumn<Victime, String> NumSerieCol;

    @FXML
    private TableColumn<Victime, Long> NumTelCol;

    @FXML
    private TextField ResearchDevice;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        NumSerieCol.setCellValueFactory(new PropertyValueFactory<Victime,String>("NumSerie"));
        EmailCol.setCellValueFactory(new PropertyValueFactory<Victime,String>("Email"));
        MarqueCol.setCellValueFactory(new PropertyValueFactory<Victime,String>("Marque"));
        NomProprioCol.setCellValueFactory(new PropertyValueFactory<Victime,String>("NomProprio"));
        NumTelCol.setCellValueFactory(new PropertyValueFactory<Victime,Long>("NumTel"));
        DatePerteCol.setCellValueFactory(new PropertyValueFactory<Victime,String>("DatePerte"));
        Connection co = DB_Connection.getConnection();
        ObservableList<Victime> listeVictimes = Read_Device.ReadDevice(co);
        tableView.setItems(listeVictimes);
        FilteredList<Victime> filteredData = new FilteredList<>(listeVictimes, p -> true);
        tableView.setItems(filteredData);
        ResearchDevice.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(ordinateur -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();
                return ordinateur.getNumSerie().toLowerCase().contains(lowerCaseFilter);
            });
        });

            ActionPossibleCol.setCellFactory(param -> new TableCell<>() {
                private final Button actionButton = new Button("Signaler");

                {
                    actionButton.setStyle("-fx-background-color: #3498db; -fx-text-fill: white;");
                    actionButton.setOnAction(event -> {
                       Victime victime = getTableView().getItems().get(getIndex());
                        System.out.println("Action exécutée pour : " + victime.getNumSerie());

                    });
                }

                @Override
                protected void updateItem(Void item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                    } else {
                        setGraphic(actionButton);
                    }
                }
            });
    }

    private void showDetailsScene(Victime victime) {
        Parent root;
        try {
            // Charger le fichier FXML de la nouvelle scène
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/search_device/DetailsScene.fxml"));
            root = loader.load();


            View4Controller controller = loader.getController();
            controller.setDetails(
                    victime.getNumSerie(),
                    victime.getEmail(),
                    victime.getMarque(),
                    victime.getNomProprio(),
                    String.valueOf(victime.getNumTel()),
                    victime.getDatePerte()
            );

        Stage stage = new Stage();
        stage.setTitle("Détails");
        stage.setScene(new Scene(root));
        stage.show();
    } catch(IOException e) {
            e.printStackTrace();
        }
    }
        @FXML
    void ActionAdd(ActionEvent event) throws IOException {
        Main1Application.SetRout("view3");
    }
    @FXML

    void ActionDelete(ActionEvent event) {
        Victime selectedItem = tableView.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            Delete_Device.DeleteDevice(selectedItem.getNumSerie());
            tableView.getItems().remove(selectedItem);
        } else {
            System.out.println("Aucun élément sélectionné !");
        }
    }
    @FXML
    void ActionSearch(ActionEvent event) {
    }
}
