package pl.SDA.fxController.metrics.metr;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class metrToPaneController {

    @FXML
    private Button feetButton;

    @FXML
    private Button yardButton;

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

                Stage stage = (Stage) feetButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/metr/giveNumberMetrToFeetPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Metr na feet");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });

        yardButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) yardButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/metr/giveNumberMetrToYardPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Metr na Yard");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });


        landMileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) landMileButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/metr/giveNumberMetrToLandMilePane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Metr na landMile");
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
                Stage stage = (Stage) seaMileButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/metr/giveNumberMetrToSeaMilePane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Metr na seaMile");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

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



