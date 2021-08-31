package com.toast.application.controller;

import com.toast.application.model.EditorModel;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class EditorController {
    @FXML
    private TextArea textArea;

    private final EditorModel model;

    public EditorController(final EditorModel model) {
        this.model = model;
    }
}
