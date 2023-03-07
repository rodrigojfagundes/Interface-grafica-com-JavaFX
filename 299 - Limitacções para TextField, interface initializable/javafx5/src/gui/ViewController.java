package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {
	
	
	//declarando 2 atributos do tipo TEXT para armazenar os valores
	//q serao digitados no GUI (VIEW.FXML)... 
	@FXML
	private TextField txtNumber1;

	@FXML
	private TextField txtNumber2;
	
	//declarando o LABEL/campo q ira MOSTRAR o RESULTADO da SOMA
	@FXML
	private Label labelResult;
	//declarando um atributo para o BOTAO q ta no GUI/VIEW.FXML, q é o botao
	//q fara a SOMA
	@FXML
	private Button btSum;
	
	//criando um METODO q sera responsavel por EXECUTAR a SOMA QUANDO O BOTAO
	//for clicado... o Bottao q ta no DESIGN VIEW.FXML... o btTest...
	@FXML
	public void onBtSumAction() {
		//try pra TENTAR fazer a soma
		try {
		Locale.setDefault(Locale.US);
		//pegando o valor q ta em txtNumber1 q foi passado pelo GUI/view.fxml
		double number1 = Double.parseDouble(txtNumber1.getText());
		//pegando o valor q ta em txtNumber2 q foi passado pelo GUI/view.fxml
		double number2 = Double.parseDouble(txtNumber2.getText());
		//criando a variavel SOMA q vai recebr a SOMA dos dois valores
		double sum = number1 + number2;
		
		//chamando a nossa VAR LABELRESULT feita ali em cima e passando para
		//ela o VALOR/text q ta na VAR SUM (no caso a SOMA dos NUMEROS)
		//para serem exibida no CAMPO de RESULTADO
		labelResult.setText(String.format("%.2f", sum));
		}
		//caso de erro.. tipo o usuario digite UMA LETRA no LUGAR DO NUMERO
		catch(NumberFormatException e) {
			//exibimos um alert
			Alerts.showAlert("error", "parse error", e.getMessage(), AlertType.ERROR);
		}
	}
	
	
	//metodo INITIALIZABLE da INTERFACE INITIALIZABLE
	//metodo q sera iniciado quando o CONTROLADOR FOR CRIADO
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		//aqui ficara acoes q sarao executadas quando iniciar o CONTROLLER
		//ou seja quando CLICAR no CAMPO para CAD NUMERO1 e NUMERO2
			//dentro do etodo INITIALIZE vamos chamar o metodo SETTEXTFIELDDOUBLE
			//q ta dentro da class CONSTRAINTS, e ele e responsavel por
			//verificar SE o NUM digitado é do tipo NUMERO e NAO LETRA
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		//chamando o metodo setTextFieldMaxLength da class constraints
		//e dizendo q os NUM1 e NUM2 tem q ter no MAX 12 casas...
		Constraints.setTextFieldMaxLength(txtNumber1, 12);
		Constraints.setTextFieldMaxLength(txtNumber2, 12);
		
	}
	
}
