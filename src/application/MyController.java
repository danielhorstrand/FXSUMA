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
   private Button botonresta;
   @FXML
   private Button botonmultiplica;
   @FXML
   private Button botondividir;
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
		   
		   int resultado = operacion1+operacion2;
		   
		   this.txtresultado.setText(resultado + "");
		   
	   } catch (NumberFormatException e){
		  Alert alert = new Alert (Alert.AlertType.ERROR);
		  alert.setContentText("Introduce numeros");
		  alert.showAndWait();
	   }
	   
   }
   public void restar(ActionEvent event) {
	      
	   try {
		   int operacion1 = Integer.parseInt(this.txtope1.getText());
		   int operacion2 = Integer.parseInt(this.txtope2.getText());
		   
		   int resultado = operacion1-operacion2;
		   
		   this.txtresultado.setText(resultado + "");
		   
	   } catch (NumberFormatException e){
		  Alert alert = new Alert (Alert.AlertType.ERROR);
		  alert.setContentText("Introduce numeros");
		  alert.showAndWait();
	   }
	   
   }
   public void multiplicar(ActionEvent event) {
	      
	   try {
		   int operacion1 = Integer.parseInt(this.txtope1.getText());
		   int operacion2 = Integer.parseInt(this.txtope2.getText());
		   
		   int resultado = operacion1*operacion2;
		   
		   this.txtresultado.setText(resultado + "");
		   
	   } catch (NumberFormatException e){
		  Alert alert = new Alert (Alert.AlertType.ERROR);
		  alert.setContentText("Introduce numeros");
		  alert.showAndWait();
	   }
	   
   }
   public void dividir(ActionEvent event) {
	      
	   try {
		   int operacion1 = Integer.parseInt(this.txtope1.getText());
		   int operacion2 = Integer.parseInt(this.txtope2.getText());
		   
		   int resultado = operacion1/operacion2;
		   
		   this.txtresultado.setText(resultado + "");
		   
	   } catch (NumberFormatException e){
		  Alert alert = new Alert (Alert.AlertType.ERROR);
		  alert.setContentText("Introduce numeros");
		  alert.showAndWait();
	   }
	   
   }

}
