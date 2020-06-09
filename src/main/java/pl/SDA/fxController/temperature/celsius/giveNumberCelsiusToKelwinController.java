package pl.SDA.fxController.temperature.celsius;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pl.SDA.data.Temperature;

import java.io.IOException;

public class giveNumberCelsiusToKelwinController {

    @FXML

    private TextArea textAreaButton;

    @FXML
    private Button convertButton;

    @FXML
    private Button backButton;

    Temperature temp = new Temperature();

    public void initialize() throws Exception {

        convertButton.setOnAction (new EventHandler<ActionEvent> () {

            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    double value = Double.parseDouble(textAreaButton.getText());
                    String stringValue = String.valueOf(temp.celsiusToKelwin(value));
                    textAreaButton.setText(stringValue);
                } catch (IllegalArgumentException e) {
                    textAreaButton.setText("Podaj liczbę!!");
                }
            }

        });

///////////////////////////////////////////////////////////////////////////////////

        backButton.setOnAction (new EventHandler<ActionEvent> () {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) backButton.getScene ().getWindow ();


                try {
                    VBox mainPane = FXMLLoader.load (getClass ().getResource ("/fxml/temperature/celsius/celsiusToPane.fxml"));
                    Scene scene = new Scene (mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("Celsius na: ");
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
