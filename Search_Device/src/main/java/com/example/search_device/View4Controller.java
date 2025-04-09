package com.example.search_device;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class View4Controller{

    @FXML
    private Label lblNumSerie;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblMarque;

    @FXML
    private Label lblNomProprietaire;

    @FXML
    private Label lblNumTel;

    @FXML
    private Label lblDatePerte;

    public void setDetails(String numSerie, String email, String marque, String nomProprietaire, String numTel, String datePerte) {
        lblNumSerie.setText(numSerie);
        lblEmail.setText(email);
        lblMarque.setText(marque);
        lblNomProprietaire.setText(nomProprietaire);
        lblNumTel.setText(numTel);
        lblDatePerte.setText(datePerte);
    }
}
