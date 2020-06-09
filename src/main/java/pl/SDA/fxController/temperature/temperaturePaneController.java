package fxController.temperature;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class temperaturePaneController {

    @FXML
    private Button celsiusButton;

    @FXML
    private Button fahrenheitButton;

    @FXML
    private Button kelwinButton;

    @FXML
    private Button backButton;


    public void initialize() {

        celsiusButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)celsiusButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/temperature/celsius/celsiusToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Celsius-Wybór");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        fahrenheitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)fahrenheitButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/temperature/fahrenheit/fahrenheitToPane.fxml"));
                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Fahrenheit-Wybór");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });


        kelwinButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) kelwinButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/temperature/kelwin/kelwinToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Kelwin-Wybór");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

///////////////////////////////////////////////////////////////////////////////////

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene().getWindow();

                Stage massStage = new Stage();

                VBox mainPane = null;
                try {
                    mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Wybór Opcji");
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

