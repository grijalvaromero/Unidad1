package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtFase;
    @FXML Label lblResultado;
    @FXML ComboBox comboBox;
    @FXML protected  void initialize(){
        comboBox.getItems().addAll(
                "Char At",
                "Ends With");
    }
    public void evento(ActionEvent event){
        String texto=txtFase.getText();
        switch (comboBox.getSelectionModel().getSelectedIndex()){
            case 0:{
                char res=texto.charAt(2);
                lblResultado.setText(res+"");
                break;
            }
            case 1:{
                boolean res = texto.endsWith("ota");
                lblResultado.setText(res+"");
                break;
            }
        }
    }
}
