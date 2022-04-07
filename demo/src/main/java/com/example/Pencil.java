package com.example;

import javafx.scene.paint.Color;

public class Pencil {

    private Color color;

    public Pencil(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
