package temperature;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class Controller {
    @FXML
    private Label labelFrom;
    @FXML
    private Label labelTo;
    @FXML
    private Spinner spinner;
    @FXML
    private Label labelResult;

    public void initialize(){
        labelFrom.setText("Celsius");
        labelTo.setText("Fahrenheit");
    }

    @FXML
    public void switchPlaces(){
        String from=labelFrom.getText();
        if (from.equals("Celsius")){
            labelFrom.setText("Fahrenheit");
            labelTo.setText("Celsius");
        }else{
             labelFrom.setText("Celsius");
             labelTo.setText("Fahrenheit");
        }
    }

    @FXML
    public void convertAction(){
        String s=labelFrom.getText();

        int amount=(int)spinner.getValue();
        double result=0;
       if (s.equals("Celsius")){
          result=convertToFehr(amount);
       }else if (s.equals("Fahrenheit")){
           result=convertToCel(amount);
       }
       labelResult.setText(String.valueOf(result));
    }

    public double convertToFehr(double amount){
        return (amount*1.8)+32;
    }

    public double convertToCel(double amount){
        return (amount-32)/1.8;    }
}
