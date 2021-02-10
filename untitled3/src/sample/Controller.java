package sample;

import Model.newclass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    public Label label;
    public newclass N = new newclass();
    @FXML

    public void click(ActionEvent actionEvent)
    {
        label.setText("" + N.setCount(label.getText()));
    }
}
