package fxController.mass.uncje;

import data.Mass;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class giveNumberUncjatoPoundsController {

    @FXML
    private TextArea textAreaButton;

    @FXML
    private Button convertButton;

    @FXML
    private Button backButton;

    Mass mass = new Mass();

    public void initialize (){

        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    String textOkno = textAreaButton.getText();
                    double textZOkna = Double.parseDouble(textOkno);
                    double result = mass.uncjaToPonds(textZOkna);
                    String rezultZOkna = String.valueOf(result);
                    textAreaButton.setText(rezultZOkna);
                }catch(IllegalArgumentException e) {
                    textAreaButton.setText("Podaj liczbę!!");

                }
                //TODO napisać to w jednej linijce
            }
        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage stage = (Stage) backButton.getScene().getWindow();

                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mass/Uncja/uncjaToPane.fxml"));
                    Scene scene = new Scene(mainPane);
                    stage.setScene(scene);
                    stage.setTitle("Uncje-Wybór");
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
