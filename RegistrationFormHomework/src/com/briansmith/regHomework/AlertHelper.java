package com.briansmith.regHomework;

import javafx.scene.control.Alert;

public class AlertHelper {
    public static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.setHeaderText(null);
        alert.show();
    }
}
