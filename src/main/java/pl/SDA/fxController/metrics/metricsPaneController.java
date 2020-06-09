package fxController.metrics;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class metricsPaneController {

    @FXML
    private Button feetButton;

    @FXML
    private Button metrButton;

    @FXML
    private Button yardButon;

    @FXML
    private Button landMileButton;

    @FXML
    private Button seaMileButton;

    @FXML
    private Button backButton;

    public void initialize() {

        feetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)feetButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/feet/feetToPane.fxml"));
                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Stopy na:");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

        metrButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)metrButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/metr/metrToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Metry na:");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        yardButon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)yardButon.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/yard/yardToPane.fxml"));

                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Metry na:");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        landMileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)landMileButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/landMile/landMileToPane.fxml"));

                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Mile lądowe na:");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        seaMileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)seaMileButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/seaMile/seaMileToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Mile morskie na:");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene().getWindow();


                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Wybór-Opcji");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}