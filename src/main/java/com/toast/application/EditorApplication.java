package com.toast.application;

import com.toast.application.controller.EditorController;
import com.toast.application.model.EditorModel;
import com.toast.application.util.Editor;
import com.toast.application.util.TUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class EditorApplication extends Application {
    public static void main(final String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws IOException {
        final FXMLLoader loader = new FXMLLoader(getClass().getResource("view/EditorView.fxml"));
        loader.setControllerFactory((t) -> new EditorController(new EditorModel()));

        stage.setTitle(TUtil.TITLE);
        stage.setScene(new Scene(new Editor(600, 400)));
        stage.show();
    }
}
