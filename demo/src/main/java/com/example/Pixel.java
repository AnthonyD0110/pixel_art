package com.example;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Pixel extends Canvas {

    public Pixel(double weight) {
        super(weight, weight);
    }

    /* Méthode d'update de la couleur */
    public void update(Color color, Pencil pencil) {
        GraphicsContext graphic = this.getGraphicsContext2D();
        graphic.setStroke(Color.GREY);
        graphic.setFill(color);
        graphic.fillRect(0, 0, this.getWidth(), this.getWidth());
        graphic.strokeRect(0, 0, this.getWidth(), this.getWidth());

        /* Survol de la souris */
        this.setOnMouseEntered(e -> {
            graphic.setStroke(Color.LIGHTGOLDENRODYELLOW);
            graphic.setFill(pencil.getColor());
            graphic.fillRect(0, 0, this.getWidth(), this.getWidth());
            graphic.strokeRect(0, 0, this.getWidth(), this.getWidth());
        });
        this.setOnMouseExited(e -> {
            graphic.setStroke(Color.GREY);
            graphic.setFill(color);
            graphic.fillRect(0, 0, this.getWidth(), this.getWidth());
            graphic.strokeRect(0, 0, this.getWidth(), this.getWidth());
        });
    }

}
