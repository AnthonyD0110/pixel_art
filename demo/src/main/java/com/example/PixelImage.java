package com.example;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class PixelImage extends GridPane {

    public PixelImage(Color color, Pencil pencil, Double d) {
        super();
        for (int i = 0; i <= 51; i++) {
            for (int j = 0; j <= 32; j++) {
                Pixel pixel = new Pixel(d);
                PixelHandler pixelHandler = new PixelHandler(pixel, pencil);
                this.add(pixel, i, j);
                pixel.update(color, pencil);
                pixel.setOnMouseClicked(pixelHandler);
            }
        }
    }

    /* Méthode pour remplir tous les pixels de la couleur du pencil */
    public void fullColor(Pencil pencil, Double d) {
        for (int i = 0; i <= 51; i++) {
            for (int j = 0; j <= 32; j++) {
                Pixel pixel = new Pixel(d);
                PixelHandler pixelHandler = new PixelHandler(pixel, pencil);
                this.add(pixel, i, j);
                pixel.update(pencil.getColor(), pencil);
                pixel.setOnMouseClicked(pixelHandler);
            }
        }
    }
}
