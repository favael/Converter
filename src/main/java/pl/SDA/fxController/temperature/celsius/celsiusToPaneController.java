package fxController.temperature.celsius;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class celsiusToPaneController {

    @FXML
    private Button toFahrenheitButton;

    @FXML
    private Button toKelwinButton;

    @FXML
    private Button backButton;


    public void initialize() throws Exception {

        toFahrenheitButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) toFahrenheitButton.getScene ().getWindow ();

                try {
                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/temperature/celsius/giveNumberCelsiusToFahrenheitPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("CelsiusToFahrenheit");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);
                } catch (IOException e) {
                    e.printStackTrace ();
                }

            }
        });

        ///////////////////////////////////////////////////////////////////////////////////

        toKelwinButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) toKelwinButton.getScene ().getWindow ();

                try {
                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/temperature/celsius/giveNumberCelsiusToKelwinPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("CelsiusToKelwin");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);
                } catch (IOException e) {
                    e.printStackTrace ();
                }

            }
        });

///////////////////////////////////////////////////////////////////////////////////

        backButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene ().getWindow ();


                try {
                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/temperature/temperaturePane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Wybór-Temperatury");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);
                } catch (IOException e) {
                    e.printStackTrace ();
                }

            }
        });
    }
}


