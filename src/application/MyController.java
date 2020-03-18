package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {

   @FXML
   private Button botonsuma;

   @FXML
   private TextField txtope1;
   @FXML
   private TextField txtope2;
   @FXML
   private TextField txtresultado;

   public void initialize() {

   }

   public void sumar(ActionEvent event) {
      
	   try {
		   int operacion1 = Integer.parseInt(this.txtope1.getText());
		   int operacion2 = Integer.parseInt(this.txtope2.getText());
		   
		   suma s = new suma(operacion1,operacion2);
		   
		   int resultado = s.suma();
		   
		   this.txtresultado.setText(resultado + "");
	   } catch (NumberFormatException e){
		  Alert alert = new Alert (Alert.AlertType.ERROR);
		  alert.setContentText("Introduce numeros");
		  alert.showAndWait();
	   }
	   
   }

}
