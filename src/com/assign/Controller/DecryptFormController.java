package com.assign.Controller;

import com.assign.Util.MainCombine;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class DecryptFormController {
    public TextField txtCipherText;
    public TextField txtKey;
    public TextField txtOriginalText;

    public void btnDecrypt_OnAction(ActionEvent actionEvent) {
        String cipherText = txtCipherText.getText();
        String key = txtKey.getText();

        if (cipherText.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid cipher text", ButtonType.OK).show();
            txtCipherText.requestFocus();
            return;
        }

        if (key.trim().isEmpty()){
            new Alert(Alert.AlertType.ERROR, "Please enter valid key", ButtonType.OK).show();
            txtKey.requestFocus();
            return;
        }

        txtOriginalText.setText(MainCombine.decrypt(cipherText, key));
    }
    }
}
