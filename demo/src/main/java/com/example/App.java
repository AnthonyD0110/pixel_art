/* Auteur : DECORTE Anthony */

package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        PixelArt pixelArt = new PixelArt();
        var scene = new Scene(pixelArt);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}