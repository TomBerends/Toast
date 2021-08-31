package com.toast.application.util;

import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class Editor extends AnchorPane {
    private final TextArea textArea;

    public Editor() {
        this(600, 400);
    }

    public Editor(final double preferredWidth, final double preferredHeight) {
        textArea = new TextArea();
        textArea.setPrefWidth(preferredWidth);
        textArea.setPrefHeight(preferredHeight);
        getChildren().add(textArea);

        setPrefWidth(preferredWidth);
        setPrefHeight(preferredHeight);
    }
}
