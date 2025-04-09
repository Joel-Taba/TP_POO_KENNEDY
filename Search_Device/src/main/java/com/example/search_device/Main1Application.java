package com.example.search_device;

import com.sun.tools.javac.Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main1Application extends Application {
    static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main1Application.class.getResource("view1.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Research Devices");
        stage.setScene(scene);
        stage.show();
    }
    public static void SetRout(String fxml) throws IOException{
        Main1Application.scene.setRoot(loadFXML(fxml));
    }
    public static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(Main1Application.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}