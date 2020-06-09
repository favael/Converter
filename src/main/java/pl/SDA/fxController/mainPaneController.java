package fxController;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.io.IOException;

public class mainPaneController {

    @FXML
    private Button massButton;

    @FXML
    private Button metricButton;

    @FXML
    private Button tempButton;

    @FXML
    private Button exitButton;

    public void initialize() throws Exception {

        metricButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) metricButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/metrics/metricsPane.fxml"));

                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Wybór Odległości");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        massButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) massButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mass/massPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Wybór-Massy");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException ioException) {
                    ioException.printStackTrace();

                }
            }
        });

        tempButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) tempButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/temperature/temperaturePane.fxml"));

                    Scene scena = new Scene(mainPane);
                    stage.setScene(scena);
                    stage.setTitle("Wybór tempoeratury: ");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

///////////////////////////////////////////////////////////////////////////////////

        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) exitButton.getScene().getWindow();
                stage.close();
            }
        });
    }
}