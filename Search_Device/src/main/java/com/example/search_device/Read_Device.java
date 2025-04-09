package com.example.search_device;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.example.search_device.Victime;
import com.example.search_device.View1Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

public class Read_Device {
    private static ObservableList<Victime> Data= FXCollections.observableArrayList();
    public static ObservableList<Victime> ReadDevice(Connection co) {
        ObservableList<Victime> Data = FXCollections.observableArrayList();

        String sql = "SELECT * FROM Ordinateur";
        try (Statement stmt = co.createStatement()) {
            ResultSet set = stmt.executeQuery(sql);
            while (set.next()) {
                Data.add(new Victime(
                        set.getString("Num_Serie"),
                        set.getString("Email"),
                        set.getString("Marque"),
                        set.getString("Nom_proprietaire"),
                        set.getLong("Num_Tel"),
                        set.getString("Date_Perte")
                ));
            }
        } catch (SQLException g) {
            System.err.println("Erreur lors de la lecture des données " + g.getMessage());
        }
        return Data;
    }

}
