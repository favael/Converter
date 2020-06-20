package pl.SDA.fxController.mass.kg;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonController {

    @FXML

    private TextArea textAreaButton;

    @FXML
    private Button convertButton;

    @FXML
    private Button backButton;

    private final Converter converter;
    private final String convertLayout;

    public CommonController(Converter converter, String convertLayout) {
        this.converter = converter;
        this.convertLayout = convertLayout;
    }

    public void goBack(MouseEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();

        try {
            VBox mainPane = FXMLLoader.load(getClass().getResource(convertLayout));
            Scene scene = new Scene(mainPane);

            stage.setScene(scene);
            stage.setTitle("Kg-Wybor");
            stage.show();
            stage.setAlwaysOnTop(true);
            stage.setResizable(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void convertData(MouseEvent event) {
        try {
            double value = Double.parseDouble(textAreaButton.getText());
            String stringValue = String.valueOf(converter.convert(value));
            textAreaButton.setText(stringValue);
        } catch (IllegalArgumentException e) {
            textAreaButton.setText("Podaj liczbę!!");
        }
    }
}
