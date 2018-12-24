package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

/**
 * CardFinal.java
 * Starter code provided by Laura Gross, Bridgewater State University, December 2018.
 * Completed by Morgan Brown, Bridgewater State University, December 2018.
 *
 * */

public class CardFinal extends Application {
    private Label myLabel;
    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Create the Image components.
        Image BalloonImage = new Image("file:HotAirBalloon.jpg");

        // Create the ImageView components.
        ImageView BalloonImage1 = new ImageView(BalloonImage);

        // Resize the moon image, preserving its aspect ratio.
        BalloonImage1.setFitWidth(200);
        BalloonImage1.setPreserveRatio(true);

        myLabel = new Label("Click the button to see a message.");
        HBox hbox = new HBox(25, myLabel);

        hbox.setAlignment(Pos.CENTER);

        // Title for button
        Button myButton = new Button("Click Me");

        // Call for when button is pressed
        myButton.setOnAction(new ButtonClickHandler());


        // Put the ImageViews in a VBox with 25 pixels spacing.
        VBox vbox = new VBox(10, BalloonImage1, hbox, myButton);

        // Have entire vbox centered
        vbox.setAlignment(Pos.CENTER);

        // Put 25 pixels of padding around the VBox.
        vbox.setPadding(new Insets(20));

        // Create a Scene with the VBox as its root node.
        Scene scene = new Scene(vbox, 300, 300);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Greeting Card");

        // Show the window.
        primaryStage.show();
    }

        class ButtonClickHandler implements EventHandler<ActionEvent>
        {
            @Override
            public void handle(ActionEvent event)
            {
                Random rand = new Random();      // Randomly generate a message
                int r = rand.nextInt(2);
                if (r == 0) {
                    myLabel.setText("Have a great day!");
                } else {
                    myLabel.setText("You're the best!");

                }

            }
        }
    }
