package com.example;

import javafx.scene.paint.Color;

public class PaletteButton {

    private String hex;
    private Color color;

    public PaletteButton(String hex) {
        this.hex = hex;
        this.color = Color.web(hex);
    }

    public String getHex() {
        return this.hex;
    }

    public Color getColor() {
        return this.color;
    }
}
