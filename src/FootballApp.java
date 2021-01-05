import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FootballApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("resources/football.fxml"));

        Scene rootFile = new Scene(root);
        primaryStage.setTitle("Football Application");
        primaryStage.setScene(rootFile);
        primaryStage.show();
        primaryStage.setWidth(1000);
        primaryStage.setHeight(700);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
