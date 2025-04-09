package com.example.search_device;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_Device {

    public static void InsertDevice(Connection co, String numSerie, String email, String marque,
                                    String nomProprietaire, String numTel, String datePerte) {

        if (co == null) {
            System.out.println("Erreur : la connexion à la base de données est nulle.");
            return;
        }

        String sql = "INSERT INTO Ordinateur (Num_Serie, Email, Marque, Nom_Proprietaire, Num_Tel, Date_Perte) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = co.prepareStatement(sql)) {

            // Associer les paramètres de la requête
            pstmt.setString(1, numSerie);               // Num_Serie
            pstmt.setString(2, email);                  // Email
            pstmt.setString(3, marque);                 // Marque
            pstmt.setString(4, nomProprietaire);        // Nom_Proprietaire
            pstmt.setString(5, numTel);                 // Num_Tel
            pstmt.setString(6, datePerte);              // Date_Perte

            // Exécuter la requête
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Les données ont été enregistrées avec succès !");
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'insertion des données : " + e.getMessage());
        }
    }
}
