package com.halil.otogarvt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("loginArayuz.fxml"));
        Parent root = fxmlLoader.load();
        SceneManager.getInstance().setStage(stage);
        Scene scene = new Scene(root, 700, 500);
        stage.setTitle("Safranbolu Otobüs Terminali");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}