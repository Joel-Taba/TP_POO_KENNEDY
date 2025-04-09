package com.example.search_device;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class View3Controller {

    @FXML
    private Button Cancel;

    @FXML
    private DatePicker DtDatePerte;

    public void setDtDatePerte(DatePicker dtDatePerte) {
        DtDatePerte = dtDatePerte;
    }

    @FXML
    private Button Enregistrer;

    @FXML
    private TextField txtEmail;

    public void setTxtEmail(TextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    @FXML
    private TextField txtMarque;

    public void setTxtMarque(TextField txtMarque) {
        this.txtMarque = txtMarque;
    }

    @FXML
    private TextField txtNumSerie;

    public void setTxtNumSerie(TextField txtNumSerie) {
        this.txtNumSerie = txtNumSerie;
    }

    @FXML
    private TextField txtProprietaire;

    public void setTxtProprietaire(TextField txtProprietaire) {
        this.txtProprietaire = txtProprietaire;
    }

    @FXML
    private TextField txtTel;

    public void setTxtTel(TextField txtTel) {
        this.txtTel = txtTel;
    }

    @FXML
    void RetourView1(ActionEvent event) throws IOException {
        Main1Application.SetRout("view1");
    }

    @FXML
    void enregistrerDonnees() {
        // Vérifiez que tous les champs sont remplis
        if (!validerChamps()) {
            System.out.println("Tous les champs doivent être remplis !");
            return;
        }

        // Récupérer les valeurs des champs
        String numTel = txtTel.getText();
        String nomProprietaire = txtProprietaire.getText();
        String numSerie = txtNumSerie.getText();
        String marque = txtMarque.getText();
        String email = txtEmail.getText();
        String datePerte = DtDatePerte.getValue().toString(); // Convertir LocalDate en String

        // Appeler la méthode InsertDevice
        Connection conn = DB_Connection.getConnection(); // Utilisez votre classe de connexion
        Insert_Device.InsertDevice(conn, numSerie, email, marque, nomProprietaire, numTel, datePerte);
    }

    private boolean validerChamps() {
        return !txtTel.getText().isEmpty() &&
                !txtProprietaire.getText().isEmpty() &&
                !txtNumSerie.getText().isEmpty() &&
                !txtMarque.getText().isEmpty() &&
                !txtEmail.getText().isEmpty() &&
                DtDatePerte.getValue() != null;
    }
}

