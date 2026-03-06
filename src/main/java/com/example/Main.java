package com.example;

import com.example.view.MainStage;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainStage mainStage = new MainStage();
        mainStage.show();
    }
}