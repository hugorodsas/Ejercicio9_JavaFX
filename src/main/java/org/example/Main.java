package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Ingrese su nombre");
        TextField textField = new TextField();
        Button button1 = new Button("Enviar");

        button1.setOnAction(e -> {
            System.out.println("Nombre ingresado: " + textField.getText());
        textField.clear();});
        VBox vbox = new VBox(label,textField,button1);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Border Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
