package sample;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        System.out.println(getClass().toString());
        System.out.println(getClass().getResource("sample.fxml").toString());

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("JavaFX App");
        primaryStage.setScene(new Scene(root, 625, 245));

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.initStyle(StageStyle.DECORATED);
        // stage.initStyle(StageStyle.TRANSPARENT);
        // stage.initStyle(StageStyle.UNDECORATED);
        // stage.initStyle(StageStyle.UNIFIED);
        // stage.initStyle(StageStyle.UTILITY);

        // stage.initModality(Modality.WINDOW_MODAL);
        //stage.initModality(Modality.NONE);

        primaryStage.show();

        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);

        stage.setScene(scene);
        stage.setFullScreen(true);

        stage.showAndWait();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
