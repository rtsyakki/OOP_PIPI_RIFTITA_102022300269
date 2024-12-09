import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    private App app;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("admin") && password.equals("1234")) {
            try {
                app.showInventory();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText("Invalid Credentials");
            alert.setContentText("Please check your username and password!");
            alert.showAndWait();
        }
    }
}
