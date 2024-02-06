package com.example;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.paint.Color;



import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Text hello = new Text(50,50,"hello world");
        Text numTwo = new Text(50,100,"second text box");

        Group root = new Group(hello,numTwo);

        scene = new Scene(root, 640, 480,Color.LIGHTGREEN);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}