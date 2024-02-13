/**
* Assignment: SDEV200_M05_Assignment2_Ex15_07
* File: ChangeColor.java
* Version: 1.0
* Date: 2/13/2024
* Author: Tomomi Hobara
* Description: This program displays a circle and changes its color to black when the mouse button is 
                pressed and to white when the mouse button is released.
* Variables: 
    - circle: A Circle object for displaying in the stage and changing colors  
* Steps:
    1. Create a circle object with white as the default color and place it in the pane
    2. Define lambda expressions to handle mouse events for pressing and releasing the mouse button
    3. Display the pane in the stage   
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class ChangeColor extends Application {
   
    @Override  //Override the start method in the Application class
    public void start (Stage primaryStage) {

        // Create a pane and create a circle
        StackPane pane = new StackPane();
        Circle circle = new Circle(70);
        circle.setStroke(Color.BLACK);
        circle.setFill (Color.WHITE);  // Set the initial color to white
        pane.getChildren().add(circle);

        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));  // Change the color to black when the mouse button is pressed
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));  // Change the color to white when the mouse button is released

        // Create a scene, place it in the stage, and display the stage
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Change the Color of the Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    } 

    public static void main (String[] args) {
        Application.launch(args);
    }
}

