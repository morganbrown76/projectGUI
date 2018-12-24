package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * An Image Demo
 */

public class ImageDemo extends Application {
    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create an Image component.
        Image image = new Image("file:HotAirBalloon.jpg"); // can be url, or in directory

        // Create an ImageView control.
        ImageView imageView1 = new ImageView(image);
        ImageView imageView2 = new ImageView(image);
        ImageView imageView3 = new ImageView(image);

        imageView1.setFitHeight(200);
        imageView1.setPreserveRatio(true);
        imageView2.setFitHeight(200);
        imageView2.setPreserveRatio(true);
        imageView3.setFitHeight(200);
        imageView3.setPreserveRatio(true);

        // Put the ImageView in an HBox.
        HBox hbox = new HBox(10, imageView1, imageView2, imageView3);

        hbox.setPadding(new Insets(30));

        // Create a Scene with the HBox as its root node.
        Scene scene = new Scene(hbox);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Hot Air Balloon");

        // Show the window.
        primaryStage.show();
    }
}