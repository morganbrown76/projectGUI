package com.company;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class buttonFinal extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Image xImage = new Image("file:X.png");
        Image oImage = new Image("file:O.png");

        ImageView ticTacImage1 = new ImageView(xImage);
        ImageView ticTacImage2 = new ImageView(oImage);
        ImageView ticTacImage3 = new ImageView(oImage);

        ticTacImage1.setFitWidth(200);
        ticTacImage1.setPreserveRatio(true);
        ticTacImage2.setFitWidth(200);
        ticTacImage2.setPreserveRatio(true);
        ticTacImage3.setFitWidth(200);
        ticTacImage3.setPreserveRatio(true);

        VBox vbox = new VBox(ticTacImage1, ticTacImage2, ticTacImage3);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Images");

        primaryStage.show();
    }
}
