package fxController.mass;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class massPaneController {

    @FXML
    private Button kgButton;

    @FXML
    private Button poundsButton;

    @FXML
    private Button uncjeButton;

    @FXML
    private Button backButton;


    public void initialize() {

        uncjeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)uncjeButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mass/Uncja/uncjaToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Uncja-Wybór");
                    stage.show();
                    stage.setResizable(true);
                    stage.setAlwaysOnTop(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        poundsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage)poundsButton.getScene().getWindow();
                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mass/Pounds/poundToPane.fxml"));
                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Funt-Wybór");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });


        kgButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) kgButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mass/Kg/kgToPane.fxml"));
                    Scene scene = new Scene(mainPane);

                    stage.setScene(scene);
                    stage.setTitle("Kg-Wybór");
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

