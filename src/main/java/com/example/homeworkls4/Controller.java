package com.example.homeworkls4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField UserAnswer;

    @FXML
    private TextArea mainTextArea;

    @FXML
    public void clickCheckButton(ActionEvent actionEvent) {
       final String userAnswerText = UserAnswer.getText();
       if (userAnswerText.isBlank()) {
           return;
       }
       String text = UserAnswer.getText();
       mainTextArea.appendText(text + "\n");
    }
}