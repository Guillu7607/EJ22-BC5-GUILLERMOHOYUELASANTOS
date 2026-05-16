package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label name = new Label("Pulsa el botón para abrir las opciones:");

        Button btn = new Button("Abrir Opciones");

        btn.setOnAction(e -> {
            List<String> opciones = Arrays.asList("Opción A", "Opción B", "Opción C");

            ChoiceDialog<String> dialog = new ChoiceDialog<>("Opción A", opciones);
            dialog.setTitle("Selección de opciones");
            dialog.setHeaderText("Por favor, elige una opción:");
            dialog.setContentText("Opciones:");

            Optional<String> result = dialog.showAndWait();

            result.ifPresent(opcionSeleccionada -> {
                System.out.println("Opción seleccionada: " + opcionSeleccionada);
            });
        });

        VBox root = new VBox(10, name, btn);
        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Ventana Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}