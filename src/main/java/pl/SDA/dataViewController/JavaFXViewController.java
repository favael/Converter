package dataViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXViewController extends Application implements Runnable {

    

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));
        Scene scene = new Scene (mainPane);
        stage.setScene (scene);
        stage.setTitle ("Start / Wybór opcji");
        stage.show ();
        stage.setAlwaysOnTop (true);
        stage.setResizable (true);
    }

    @Override
    public void run() {
        launch ();
    }
}
