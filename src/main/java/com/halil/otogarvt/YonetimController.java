package com.halil.otogarvt;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;


public class YonetimController {

    @FXML
    private AnchorPane anaPane; // Kullanılan AnchorPane'iniz


    public void initialize() {
        SceneManager sceneManager = SceneManager.getInstance();
        sceneManager.setMainPane(anaPane); // yourAnchorPane, kullanılan AnchorPane'in adı
    }
}

