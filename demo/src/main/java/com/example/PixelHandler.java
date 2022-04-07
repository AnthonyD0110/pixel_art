package com.example;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class PixelHandler implements EventHandler<MouseEvent> {
    private Pixel pixel;
    private Pencil pencil;

    public PixelHandler(Pixel pixel, Pencil pencil) {
        this.pixel = pixel;
        this.pencil = pencil;
    }

    @Override
    public void handle(MouseEvent e) {
        pixel.update(pencil.getColor(), pencil);

    }
}
