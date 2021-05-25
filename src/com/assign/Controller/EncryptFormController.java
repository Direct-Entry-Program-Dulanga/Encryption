package com.assign.Controller;

import com.assign.Util.MainCombine;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class EncryptFormController {

    public TextField txtOriginalText;
    public TextField txtKey;
    public TextField txtCipherText;

    public void btnEncrypt_OnAction(ActionEvent actionEvent) {
        String text = txtOriginalText.getText();
        String key = txtKey.getText();

        if (text.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid text", ButtonType.OK).show();
            txtOriginalText.requestFocus();
            return;
        }

        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }

        txtCipherText.setText(MainCombine.encrypt(text, key));
    }
}
