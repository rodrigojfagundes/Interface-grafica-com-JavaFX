package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//classe q vai servir para CONTROLLAR o nosso VIEW.FXML (arquivo com o DESIGN)
public class ViewController {
	
	
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
	
}
