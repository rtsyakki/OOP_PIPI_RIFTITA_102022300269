import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {

    @FXML
    private TableView<Album> albumTable;
    @FXML
    private TableColumn<Album, String> nameColumn;
    @FXML
    private TableColumn<Album, String> artistColumn;
    @FXML
    private TableColumn<Album, Integer> totalColumn;
    @FXML
    private TableColumn<Album, Integer> availableColumn;
    @FXML
    private TableColumn<Album, Integer> rentedColumn;

    @FXML
    private TextField nameField;
    @FXML
    private TextField artistField;
    @FXML
    private TextField totalField;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        rentedColumn.setCellValueFactory(new PropertyValueFactory<>("rented"));

        albumTable.setItems(albumList);
        albumTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showAlbumDetails(newValue));
    }

    private void showAlbumDetails(Album album) {
        if (album != null) {
            nameField.setText(album.getAlbumName());
            artistField.setText(album.getArtist());
            totalField.setText(String.valueOf(album.getTotal()));
        } else {
            nameField.clear();
            artistField.clear();
            totalField.clear();
        }
    }

    @FXML
    private void handleAdd() {
        String name = nameField.getText();
        String artist = artistField.getText();
        String total = totalField.getText();

        try {
            int totalInt = Integer.parseInt(total);
            Album album = new Album(name, artist, totalInt);
            albumList.add(album);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Album added successfully!");
            alert.showAndWait();
        } catch (NumberFormatException e) {
            showErrorAlert("Invalid Input", "Total must be a number.");
        }
    }

    @FXML
    private void handleUpdate() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            selectedAlbum.setAlbumName(nameField.getText());
            selectedAlbum.setArtist(artistField.getText());
            try {
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                albumTable.refresh();
                showSuccessAlert("Album updated successfully!");
            } catch (NumberFormatException e) {
                showErrorAlert("Invalid Input", "Total must be a number.");
            }
        }
    }

    @FXML
    private void handleDelete() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showSuccessAlert("Album deleted successfully!");
        }
    }

    @FXML
    private void handleRent() {
        Album selectedAlbum = albumTable.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            selectedAlbum.setRented(selectedAlbum.getRented() + 1);
            albumTable.refresh();
            showSuccessAlert("Album rented successfully!");
        } else {
            showErrorAlert("Error", "No available albums to rent.");
        }
    }

    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showSuccessAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
