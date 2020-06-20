package pl.SDA.fxController.mass.kg;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class kgToPaneController {
    private static final String BACK_LAYOUT = "/fxml/mass/Kg/kgToPane.fxml";
    private static final String COMMON_CONVERTER_LAYOUT = "/fxml/mass/Kg/common_convert_layout.fxml";

    @FXML
    private Button toPoundsButton;

    @FXML
    private Button toUncjaButton;

    @FXML
    private Button backButton;


    public void initialize() throws Exception {

        toUncjaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) toUncjaButton.getScene().getWindow();

                try {
                    CommonController controller = new CommonController(new KgToPoundsConverter(), BACK_LAYOUT);
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(COMMON_CONVERTER_LAYOUT));
                    loader.setController(controller);
                    Scene scene = new Scene(loader.load());

                    stage.setScene(scene);
                    stage.setTitle("KgToUcja");
                    stage.show();
                    stage.setAlwaysOnTop(true);
                    stage.setResizable(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        ///////////////////////////////////////////////////////////////////////////////////

        toPoundsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage stage = (Stage) toPoundsButton.getScene().getWindow();

                try {
                    CommonController controller = new CommonController(new KgToOuncesConverter(), BACK_LAYOUT);
                    FXMLLoader loader = new FXMLLoader(getClass().getResource(COMMON_CONVERTER_LAYOUT));
                    loader.setController(controller);
                    Scene scene = new Scene(loader.load());

                    stage.setScene(scene);
                    stage.setTitle("KgtoPounds");
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


                try {
                    VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
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


