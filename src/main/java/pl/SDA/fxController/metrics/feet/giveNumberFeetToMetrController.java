package fxController.metrics.feet;

import data.Metrics;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class giveNumberFeetToMetrController {

    @FXML
    private TextField textButton;

    @FXML
    private Button convertButton;

    @FXML
    private Button backButton;

    Metrics metritc = new Metrics();

    public void initialize() {

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    double valueTextonDouble = Double.parseDouble(textButton.getText());
                    String valueofFeet = String.valueOf(metritc.feetToMetr(valueTextonDouble));
                    textButton.setText(valueofFeet);
                } catch(IllegalArgumentException e) {
                    textButton.setText("Podaj liczbę!!");
                }
            }
        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) backButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/feet/feetToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Wybór-Odległości");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
    }
}