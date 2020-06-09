package pl.SDA.fxController.metrics.seaMile;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pl.SDA.data.Metrics;

import java.io.IOException;

public class giveNumberSeaMileToYardController {

    @FXML
    private TextField textButton;

    @FXML
    private Button convertButton;

    @FXML
    private Button backButton;

    Metrics metrics = new Metrics();

    public void initialize() {

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    double naText = Double.parseDouble(textButton.getText());
                    String zMetody = String.valueOf(metrics.seaMileToYard(naText));
                    textButton.setText(zMetody);
                } catch(IllegalArgumentException e) {
                    textButton.setText("Podaj liczbę!!");
                }
            }
        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            Stage stage = (Stage)backButton.getScene().getWindow();
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
    }
}
