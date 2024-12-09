import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        showLogin();
    }

    public void showLogin() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent root = loader.load();
        LoginController loginController = loader.getController();
        loginController.setApp(this);

        primaryStage.setTitle("Zeppeli's Listening Bar - Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void showInventory() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("inventory.fxml"));
        Parent root = loader.load();
        InventoryController inventoryController = loader.getController();
        //inventoryController.setApp(this);

        primaryStage.setTitle("Zeppeli's Listening Bar - Inventory");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
