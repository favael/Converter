package fxController.mass.uncje;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class uncjaToPaneController {

    @FXML
    private Button toKgButton;

    @FXML
    private Button toPoundButton;

    @FXML
    private Button backButton;

    public void initialize() {

        toKgButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)toKgButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mass/Uncja/giveNumberUncjaToKgPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene (scene);
                    stage.setTitle ("UncjaToKg");
                    stage.show ();
                    stage.setAlwaysOnTop (true);
                    stage.setResizable (true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        toPoundButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)toPoundButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mass/Uncja/giveNumberUncjaToPoundsPane.fxml"));
                    Scene scena = new Scene(mainPane);

                    stage.setScene(scena);
                    stage.setTitle("UncjaToPounds");
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
                Stage stage = (Stage)backButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));

                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Wybór-Masy");
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
