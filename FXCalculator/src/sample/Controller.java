package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class Controller {


    @FXML
    private TextField resultText;





    private String operator = "";
    private long number1 = 0;
    Model model = new Model();
    private  boolean start = true;



    @FXML
    void getNumber(ActionEvent event) {
        if (start){
            resultText.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        resultText.setText(resultText.getText() + value);

    }


    @FXML
    public void proccessOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if (!"=".equals(value)){
            if (!operator.isEmpty())
                return;

            operator = value;
            number1 = Long.parseLong(resultText.getText());
            resultText.setText("");

        } else{
            if (operator.isEmpty())
                return;


            resultText.setText(String.valueOf(model.calculate(number1,Long.parseLong(resultText.getText()), operator)));
            operator ="";
            start = true;
        }
    }
}
