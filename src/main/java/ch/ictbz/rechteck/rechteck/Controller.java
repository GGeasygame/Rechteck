package ch.ictbz.rechteck.rechteck;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.nio.DoubleBuffer;

public class Controller {
    @FXML
    private TextField widthTextField;
    @FXML
    private TextField heightTextField;
    @FXML
    private TextField outputTextField;

    Rectangle rectangle = new Rectangle();

    @FXML
    protected void onBerechnenButtonClick() {
        String inputWidth = widthTextField.getText();
        String inputHeight = heightTextField.getText();
        if (inputWidth.equals("") || inputHeight.equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fehlermeldung");
            alert.setContentText("Bitte geben Sie die Höhe und die Breite des Rechtecks ein.");
            alert.showAndWait();
            return;
        }

        if (!inputWidth.matches("-?\\d+(\\.\\d+)?") || !inputHeight.matches("-?\\d+(\\.\\d+)?")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fehlermeldung");
            alert.setContentText("Bitte geben Sie nur Zahlen ein.");
            alert.showAndWait();
            return;
        }

        double width = Double.parseDouble(inputWidth);
        double height = Double.parseDouble(inputHeight);

        rectangle.setWidth(width);
        rectangle.setHeight(height);


        outputTextField.setText(String.valueOf(rectangle.getArea()));
    }

    @FXML
    protected void onBeendenButtonClick() {
        
    }
}