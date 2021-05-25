package com.assign.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public void btnEncrypt_OnAction(ActionEvent actionEvent) throws IOException {
        Stage newStage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource("../View/EncryptForm.fxml"));
        Scene tableScene = new Scene(root);
        newStage.setScene(tableScene);
        newStage.setTitle("Encryption");
        newStage.centerOnScreen();
        newStage.initModality(Modality.WINDOW_MODAL);
        newStage.show();
    }

    public void btnDecrypt_OnAction(ActionEvent actionEvent) throws IOException {
        Stage newStage = new Stage();
        Parent root = FXMLLoader.load(this.getClass().getResource("../View/DecryptForm.fxml"));
        Scene tableScene = new Scene(root);
        newStage.setScene(tableScene);
        newStage.setTitle("Decryption");
        newStage.centerOnScreen();
        newStage.initModality(Modality.WINDOW_MODAL);
        newStage.show();
    }
}
