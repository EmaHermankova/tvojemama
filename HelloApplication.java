package com.example.tlacitko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    long startTime;
    Label l;

    public HelloApplication(){
        startTime = System.currentTimeMillis();
    }

    public void stopky(){
        long now = System.currentTimeMillis();
        l.setText("bezim uz " + ((now-startTime)/1000) + " sekund");
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("tvoje mama");
        l = new Label("???");
        VBox v = new VBox(l, button);

        l.setStyle("-fx-font-size:40pt");

        StackPane pane = new StackPane(v);
        Scene scene = new Scene(pane, 640, 480);

        button.setOnAction(e -> stopky());

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}