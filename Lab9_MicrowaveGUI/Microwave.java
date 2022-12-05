package com.lab9.microwave;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class Microwave extends Application {
    // These fields are used throughout methods
    GridPane gridPane = new GridPane();
    TextField timer;
    StringBuilder txt = new StringBuilder();


    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Microwave Oven");
        stage.setResizable(false); // Not let the user resize it
        stage.toFront();    // Bring it to the front
        // Get the size of the user's screen. We will use it to center the application
        double HEIGHT_OF_SCREEN = Screen.getPrimary().getBounds().getHeight();
        double WIDHT_OF_SCREEN = Screen.getPrimary().getBounds().getWidth();

        StackPane root = new StackPane();
        Label placeFood = new Label("Place Food Here");
        timer = new TextField("Time to be displayed here");

        // Padding
        placeFood.setPadding(new Insets(50, 5, 50, 5));

        timer.setMinWidth(100);

        /**
         * Assign default widths to the columns by creating new columns with constraints
         */
        gridPane.getColumnConstraints().add(new ColumnConstraints(100));
        gridPane.getColumnConstraints().add(new ColumnConstraints(220));

        // Add the two nodes
        gridPane.add(placeFood, 0, 0, 1, 2); // Span over 1 column, 2 rows from position 0,0
        gridPane.add(timer, 1, 0);

        // Buttons Pane
        GridPane buttons = new GridPane();

        // We will construct each button with label of the value of i
        int i = 1;
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 3; column++) {
                Button button = new Button(String.valueOf(i % 10));

                button.setPrefWidth(62); // Default width
                button.setOnAction(new EventHandler<ActionEvent>() {
                                       public void handle(ActionEvent actionEvent) {
                                           // See if we can convert the value to an Integer
                                           try {
                                               txt.append(Integer.parseInt(timer.getText()));
                                           } catch (NumberFormatException e) {
                                               // Catch the string and clear it
                                               timer.setText(button.getText());
                                           } finally {
                                               // Add the number pressed to it and clear the container
                                               timer.setText(txt.append(button.getText()).toString());
                                               txt = new StringBuilder();
                                           }
                                       }
                                   }
                );

                // add the button to the grid
                buttons.add(button, column, row);
                i++;
                // Break the inner forloop because we will not make number for 11 and 12
                if (i > 10) {
                    break;
                }
            }
        }

            // Start will set the default text back
            Button start = new Button("Start");
            start.setOnAction( actionEvent ->
                timer.setText("Time to be displayed here")
            );
            start.setPrefWidth(62);

            // Stop will close the application
            Button stop = new Button("Stop");
            stop.setPrefWidth(62);
            stop.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    Platform.exit();
                }
            });
            buttons.add(start, 1, 3);
            buttons.add(stop,2,3);

        // Add the buttons to the main grid at 1,1
        gridPane.add(buttons, 1, 1);

        // Format the buttons with Gaps
        buttons.setHgap(2);
        buttons.setVgap(5);

        // Add the maingrid to the StackPane
        root.getChildren().add(gridPane);
        Scene scene = new Scene(root, 340, 150);

        stage.setScene(scene);


        // Move the top left corner to the center, then translate it up and left by halving the widht and height of the app window
        // Setting the center of the app window to the center of the screen
        stage.setX(WIDHT_OF_SCREEN / 2.0 - scene.getWidth() / 2.0);
        stage.setY(HEIGHT_OF_SCREEN / 2.0 - scene.getHeight() / 2.0);

        stage.show();


    }

    /*
    Launch the application
     */
    public static void main(String[] args) {
        System.out.println("Starting");
        launch(args);
        System.out.println("Finished");
    }


}