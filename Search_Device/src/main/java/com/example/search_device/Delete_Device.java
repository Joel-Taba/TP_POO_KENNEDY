package com.example.search_device;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_Device {

    public static void DeleteDevice(String numSerie) {
        String sql = "DELETE FROM Ordinateur WHERE Num_Serie = ?";

        try (Connection co = DB_Connection.getConnection(); PreparedStatement pstmt = co.prepareStatement(sql)) {
            pstmt.setString(1, numSerie);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("L'enregistrement " + numSerie + " a été supprimé!");
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression : " + e.getMessage());
        }
    }
}
