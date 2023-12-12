package com.halil.otogarvt;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class SceneManager {

    private AnchorPane mainPane;
    private static SceneManager instance;
private Stage stage;

    private SceneManager() {
        // Boş yapıcı, sınıfın tek bir örneğinin oluşturulmasını sağlar
    }

    public static SceneManager getInstance(){
        if (instance == null) {
            instance = new SceneManager();
        }
        return instance;
    }
    public void setMainPane(AnchorPane mainPane) {
        this.mainPane = mainPane;
    }
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void centerStage() {
        if (stage != null) {
            stage.centerOnScreen();
        }
    }
    public void loadScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeBackgroundColor(String color) {
        if (mainPane != null) {
            mainPane.setStyle("-fx-background-color: " + color + ";");
        }
        else {
            System.out.println("mainPane is null. Cannot change background color.");
        }
    }
}
