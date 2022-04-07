package com.example;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class PixelArt extends VBox {
    Pencil color;

    public PixelArt() {
        super();
        /* Palette */
        PaletteButton red = new PaletteButton("#FF0000");
        PaletteButton blue = new PaletteButton("#0000FF");
        PaletteButton yellow = new PaletteButton("#FFFF00");
        PaletteButton green = new PaletteButton("#008000");
        PaletteButton white = new PaletteButton("#FFFFFF");
        PaletteButton black = new PaletteButton("#000000");
        PaletteButton purple = new PaletteButton("#800080");
        PaletteButton pink = new PaletteButton("#FFC0CB");
        PaletteButton orange = new PaletteButton("#FFA500");
        PaletteButton cyan = new PaletteButton("#00FFFF");
        PaletteButton brown = new PaletteButton("#A0522D");
        PaletteButton gray = new PaletteButton("#808080");
        PaletteButton[] palette = { red, blue, yellow, green, white, black, purple, pink, orange, cyan, brown, gray };
        Pencil pencil = new Pencil(green.getColor());
        GridPane grid = new GridPane();

        /* Pixel Image */
        PixelImage pixelImage = new PixelImage(black.getColor(), pencil, 20.0);
        for (int i = 0; i <= palette.length - 1; i++) {
            Button button = new Button();
            button.setStyle(
                    "-fx-background-color:" + palette[i].getHex() + "; -fx-min-width : 80;-fx-min-Height:80;");
            grid.add(button, i, 0);
            Color color = palette[i].getColor();
            button.setOnAction(e -> {
                pencil.setColor(color);
            });
        }

        /* Bouton qui permet de remplir tous les pixels de la couleur du pencil */
        Button fillButton = new Button("Remplir");
        fillButton.setStyle("-fx-background-color:white; -fx-min-width : 80;-fx-min-Height:80;");
        grid.add(fillButton, palette.length, 0);
        fillButton.setOnAction(e -> {
            pixelImage.fullColor(pencil, 20.00);
        });
        this.getChildren().addAll(grid, pixelImage);
    }
}
